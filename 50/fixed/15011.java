@java.lang.Override
public void tick() {
    if ((state.getCommandToExecute()) != null) {
        state.getCommandToExecute().execute();
        state.setCommandToExecute(null);
    }
}