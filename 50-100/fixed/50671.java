void hideRecents(boolean triggeredFromAltTab, boolean triggeredFromHomeKey) {
    if (mBootCompleted) {
        android.app.ActivityManager.RunningTaskInfo topTask = mSystemServicesProxy.getTopMostTask();
        if ((topTask == null) || (!(mSystemServicesProxy.isRecentsTopMost(topTask, null)))) {
            triggeredFromHomeKey = true;
        }
        android.content.Intent intent = com.android.systemui.recents.AlternateRecentsComponent.createLocalBroadcastIntent(mContext, com.android.systemui.recents.AlternateRecentsComponent.ACTION_HIDE_RECENTS_ACTIVITY);
        intent.putExtra(com.android.systemui.recents.AlternateRecentsComponent.EXTRA_TRIGGERED_FROM_ALT_TAB, triggeredFromAltTab);
        intent.putExtra(com.android.systemui.recents.AlternateRecentsComponent.EXTRA_TRIGGERED_FROM_HOME_KEY, triggeredFromHomeKey);
        mContext.sendBroadcastAsUser(intent, UserHandle.CURRENT);
    }
}