@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    if ((conflictBuilder) != null) {
        conflictBuilder.create().dismiss();
        conflictBuilder = null;
    }
}