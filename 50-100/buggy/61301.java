@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    if ((currentColor) != null) {
        outState.putInt(com.rubengees.vocables.activity.ExtendedToolbarActivity.SAVED_INSTANCE_STATE_COLOR, currentColor);
    }
    if ((currentColorDark) != null) {
        outState.putInt(com.rubengees.vocables.activity.ExtendedToolbarActivity.SAVED_INSTANCE_STATE_COLOR_DARK, currentColorDark);
    }
    if ((currentTitle) != null) {
        outState.putCharSequence(com.rubengees.vocables.activity.ExtendedToolbarActivity.SAVED_INSTANCE_STATE_TITLE, currentTitle);
    }
    outState.putBoolean(com.rubengees.vocables.activity.ExtendedToolbarActivity.SAVED_INSTANCE_STATE_IS_EXTENDED, isExtended);
}