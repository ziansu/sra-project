public void addCommand(com.gmail.einsyui.buildutils.argumentreader.Command cmd) {
    commandTable.put(cmd.name().toLowerCase(), cmd);
    for (com.gmail.einsyui.buildutils.argumentreader.Argument arg : cmd.args()) {
        com.gmail.einsyui.buildutils.argumentreader.ArgumentType<?> at = arg.type();
        usedArgumentTypes.put(at.name(), at);
    }
}