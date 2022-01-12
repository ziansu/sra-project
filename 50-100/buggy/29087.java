@java.lang.Override
public void onClick(android.view.View v) {
    if (((currentPauses) < (maxPauses)) || ((maxPauses) == (-1))) {
        if (isActive) {
            updateControlIcon(ca.hoogit.powerhour.Views.GameControlButtons.GameStates.ACTIVE);
            (currentPauses)++;
        }else {
            updateControlIcon(ca.hoogit.powerhour.Views.GameControlButtons.GameStates.PAUSED);
        }
    }else {
        if (!(isActive)) {
            updateControlIcon(ca.hoogit.powerhour.Views.GameControlButtons.GameStates.NO_MORE_PAUSES);
            android.util.Log.d(ca.hoogit.powerhour.Views.GameControlButtons.TAG, "Disabling the control button");
        }
    }
    isActive = !(isActive);
    mListener.controlPressed(isActive, currentPauses);
}