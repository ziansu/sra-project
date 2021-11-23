private static java.lang.String getDialogTitle(boolean isAPush) {
    int stringId = (isAPush) ? R.string.dialog_title_push_response : R.string.dialog_title_pull_response;
    return org.eyeseetea.malariacare.data.database.utils.PreferencesState.getInstance().getContext().getString(stringId);
}