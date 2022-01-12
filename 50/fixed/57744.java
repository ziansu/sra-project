@java.lang.Override
protected void updateView() {
    if (rebuildItems()) {
        android.util.Log.e(LOG_TAG, "Items are rebuilding, entering into Do Layout");
        measureLayout();
        doLayout(getWidth(), getHeight(), false);
    }
}