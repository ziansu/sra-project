public void updateClass(java.lang.Class<?> value) {
    java.lang.String commandName = "";
    for (java.lang.String key : _htblCommands.keySet()) {
        java.lang.Class<?> commandClass = _htblCommands.get(key);
        if (commandClass.getName().equals(value)) {
            commandName = key;
            break;
        }
    }
    if ((commandName.length()) > 0) {
        _htblCommands.put(commandName, value);
    }
}