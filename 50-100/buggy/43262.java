public com.ptdev.picore.actions.Sequence build() throws com.ptdev.exceptions.InvalidConfigSetupException {
    com.ptdev.picore.actions.Sequence seq = new com.ptdev.picore.actions.Sequence(name);
    java.lang.System.out.println(java.lang.String.format("Building sequence '%s'", name));
    java.lang.System.out.println((("Found " + (actions.size())) + " actions in sequence."));
    for (com.ptdev.support.ActionBuilder action : actions) {
        com.ptdev.picore.io.Mcp23017 chip = com.ptdev.picore.io.IoContext.getInstance().getMcpMap().get(com.ptdev.picore.io.IOsupport.getChipIndex(action.pin));
        seq.addAction(action.build(chip));
    }
    return seq;
}