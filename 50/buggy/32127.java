private int getDoneMessage() {
    boolean isAPush = org.eyeseetea.malariacare.ProgressActivity.isAPush();
    if (!isAPush) {
        return R.string.dialog_pull_success;
    }
    if (hasAPullAfterPush()) {
        return R.string.dialog_push_before_pull_success;
    }
    return R.string.dialog_push_success;
}