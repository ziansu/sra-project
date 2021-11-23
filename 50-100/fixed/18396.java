public models.Platform detectPlatform() {
    helper.unix.parser.DetectPlatformPP dp = new helper.unix.parser.DetectPlatformPP();
    java.lang.String command = "uname -v && " + (("uname -m && " + "uname -o && ") + "uname -r");
    runCommand(command, dp);
    this.platform = dp.getPlatform();
    this.platform.distribution = this.distribution;
    this.host.platform = this.platform;
    return this.platform;
}