@java.lang.Override
public boolean takeControl() {
    return (queue.hasNextTouchSensorEvent()) && ((state.getState()) == (ve.ucv.ciens.cicore.icaro.ryabi.utils.States.WANDER));
}