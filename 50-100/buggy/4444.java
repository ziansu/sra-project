public static java.lang.String getWebInfoPath() {
    java.lang.String os = java.lang.System.getenv("OS");
    java.lang.String prefix = "";
    if (!(os.toLowerCase().contains("windows"))) {
        prefix = "/";
    }
    return prefix + (createsh.util.PathUtil.getWebInfPath());
}