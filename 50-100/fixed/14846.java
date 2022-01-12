@java.lang.Override
protected void onRestoreInstanceState(android.os.Parcelable state) {
    if ((state == null) || (!(state.getClass().equals(org.mcjug.aameetingmanager.util.RecoveryDatePreference.SavedState.class)))) {
        super.onRestoreInstanceState(state);
    }else {
        org.mcjug.aameetingmanager.util.RecoveryDatePreference.SavedState s = ((org.mcjug.aameetingmanager.util.RecoveryDatePreference.SavedState) (state));
        super.onRestoreInstanceState(s.getSuperState());
        setTheDate(s.dateValue);
    }
}