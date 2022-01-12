public boolean hasPermisssion(java.lang.String command, java.lang.String username) {
    java.lang.String permLevel = userPerms.get(username);
    java.util.List<java.lang.String> commands = commandPerms.get(permLevel);
    boolean hasCommand = false;
    if (commands != null) {
        hasCommand = commands.contains(command);
    }
    if ((username.equals("self")) || hasCommand) {
        return true;
    }else {
        return false;
    }
}