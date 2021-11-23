@java.lang.Override
public void executeCommand() {
    final VASL.build.module.OBA.Module mod = oba.getModuleAt(index);
    oldState = mod.getState();
    mod.setState(newState);
}