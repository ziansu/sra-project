@java.lang.Override
public void onFlashlightTurnedOn() {
    mRemoteUi.setUiButtonsOn(true);
    com.byteshaft.neon.AppGlobals.setIsServiceSwitchInProgress(false);
}