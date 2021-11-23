public void executeCommand() {
    VASL.build.module.OBA.Module mod = oba.getModuleAt(index);
    oldState = mod.getState();
    mod.setState(newState);
}