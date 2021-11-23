@java.lang.Override
public void run() {
    if (com.android.internal.actions.ActionUtils.isCapKeyDevice(mContext)) {
        com.android.internal.actions.ActionUtils.resolveAndUpdateButtonActions(ctx, com.android.internal.actions.ActionConstants.getDefaults(ActionConstants.HWKEYS));
    }
    com.android.internal.actions.ActionUtils.resolveAndUpdateButtonActions(ctx, com.android.internal.actions.ActionConstants.getDefaults(ActionConstants.NAVBAR));
    com.android.internal.actions.ActionUtils.resolveAndUpdateButtonActions(ctx, com.android.internal.actions.ActionConstants.getDefaults(ActionConstants.FLING));
}