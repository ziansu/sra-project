public void onSaveInstanceState() {
    android.os.Bundle bundle = new android.os.Bundle();
    if ((mParentDelegate) != null) {
        bundle = mParentDelegate.mChildKeyTagsBundle;
    }
    onSaveInstanceState(bundle);
    mParentDelegate.mBundle.putAll(bundle);
}