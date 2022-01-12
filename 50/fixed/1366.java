@java.lang.Override
public void onLowerBoundValue(com.freedomotic.model.ds.Config params, boolean fireCommand) {
    boolean executed = executeCommand("set saturation", params);
    setSaturation(0);
}