@java.lang.Override
protected void onUpdateIntend(java.lang.String modifiedContent) {
    android.content.Intent newIntent = cloneIntent(modifiedContent);
    editableIntent = newIntent;
    showAllIntentData(uri);
}