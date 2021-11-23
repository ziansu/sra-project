@java.lang.Override
public void tick() {
    if ((state.getCommandToExecute()) != null) {
        java.lang.System.out.println("executing controller command");
        state.getCommandToExecute().execute();
        state.setCommandToExecute(null);
    }
}