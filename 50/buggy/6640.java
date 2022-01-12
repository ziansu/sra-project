@java.lang.Override
public void onDismiss(android.content.DialogInterface dialog) {
    mActiveStreamType = -1;
    mAudioManager.forceVolumeControlStream(mActiveStreamType);
    setZenPanelVisible(false);
    mDemoIcon = 0;
    mSecondaryIconTransition.cancel();
}