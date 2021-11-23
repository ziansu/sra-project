public com.ptdev.picore.actions.Sequence build() throws com.ptdev.exceptions.InvalidConfigSetupException {
    com.ptdev.picore.actions.Sequence seq = new com.ptdev.picore.actions.Sequence(name);
    java.lang.System.out.println(java.lang.String.format("Building sequence '%s'", name));
    java.lang.System.out.println((("Found " + (actions.size())) + " actions in sequence."));
    for (int i = 0; i < (actions.size()); i++) {
        seq.addAction(actions.get(i).build());
    }
    return seq;
}