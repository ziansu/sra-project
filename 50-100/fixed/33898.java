public boolean hasPermisssion(java.lang.String command, java.lang.String username) {
    if (username.equals("self")) {
        return true;
    }
    java.lang.String permLevel = userPerms.get(username);
    java.util.List<java.lang.String> commands = null;
    if (permLevel != null) {
        commands = commandPerms.get(permLevel);
    }
    boolean hasCommand = false;
    if (commands != null) {
        hasCommand = commands.contains(command);
    }
    return hasCommand;
}