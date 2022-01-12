public void cancelAdding(android.view.View v) {
    changeToModeNormal();
    if ((selectedViews) != null) {
        java.util.Arrays.fill(selectedViews, java.lang.Boolean.FALSE);
        resetViews();
    }
}