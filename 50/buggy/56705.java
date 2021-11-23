@java.lang.Override
protected void onUpdateIntend(java.lang.String modifiedContent) {
    android.content.Intent newIntent = uk.co.ashtonbrsc.intentexplode.Explode.cloneIntent(modifiedContent);
    editableIntent = newIntent;
    showAllIntentData(uri);
}