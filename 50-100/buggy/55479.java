public boolean register(int level, java.lang.String command) {
    boolean result = false;
    java.util.List<java.lang.String> commands = commandPerms.get(level);
    if (commands != null) {
        commands.add(command);
        result = true;
    }
    return result;
}