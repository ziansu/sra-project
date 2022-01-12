@java.lang.Override
public void onActionDispatched(com.android.internal.policy.impl.HardkeyActionHandler.HardKeyButton button, java.lang.String task) {
    if (task.equals(com.android.internal.policy.impl.HardkeyActionHandler.HardKeyButton.HOME)) {
        mHandler.sendEmptyMessage(com.android.internal.policy.impl.HardkeyActionHandler.MSG_FIRE_HOME);
        return ;
    }else
        if (task.equals(com.android.internal.policy.impl.HardkeyActionHandler.HardKeyButton.SLEEP)) {
            button.setPressed(false);
            button.setWasConsumed(false);
        }
    
    performTask(task);
}