public Command GetCommand(java.lang.String name) {
    for (Command c : mCommands) {
        if (c.GetName().equals(name)) {
            return c;
        }
    }
    return null;
}