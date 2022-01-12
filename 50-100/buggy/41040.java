@java.lang.Override
protected void changeStateFromPress(boolean buttonOn) {
    if (!(mHasTelephony))
        return ;
    
    if (!(java.lang.Boolean.parseBoolean(android.os.SystemProperties.get(TelephonyProperties.PROPERTY_INECM_MODE)))) {
        this.mState = (buttonOn) ? com.android.server.policy.GlobalActions.ToggleAction.State.TurningOn : com.android.server.policy.GlobalActions.ToggleAction.State.TurningOff;
        mAirplaneState = this.mState;
    }
}