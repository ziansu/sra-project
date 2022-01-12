static com.gatf.selenium.Command read(java.io.File file, java.util.List<java.lang.String> commands, java.util.Map<java.lang.String, com.gatf.selenium.SeleniumDriverConfig> mp) throws java.lang.Exception {
    if (commands == null) {
        commands = new java.util.ArrayList<java.lang.String>();
    }else {
        commands.clear();
    }
    commands.addAll(org.apache.commons.io.FileUtils.readLines(file, "UTF-8"));
    com.gatf.selenium.Command cmd = com.gatf.selenium.Command.getAll(commands);
    cmd.name = file.getName();
    cmd.mp = mp;
    return cmd;
}