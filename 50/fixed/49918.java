@java.lang.Override
protected VASSAL.command.Command myUndoCommand() {
    try {
        return new VASL.build.module.OBA.CreateModule(oba, index, state);
    } catch (java.lang.RuntimeException ex) {
        return null;
    }
}