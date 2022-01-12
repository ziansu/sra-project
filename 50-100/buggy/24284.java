private void resetData() {
    try {
        _startDate = null;
        _startingWeight = null;
        alternateBackgroundColor = false;
        android.widget.TableLayout tl = ((android.widget.TableLayout) (findViewById(R.id.tableLayout1)));
        int rows = tl.getChildCount();
        tl.removeViews(1, (rows - 1));
        deleteFile();
    } catch (java.lang.Exception e) {
        showExceptionAlert(e);
    }
}