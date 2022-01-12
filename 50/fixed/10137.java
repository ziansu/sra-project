public void onSaveInstanceState() {
    android.os.Bundle bundle = new android.os.Bundle();
    if (((mParentDelegate) != null) && ((mParentDelegate.mBundle) != null)) {
        bundle = mParentDelegate.mBundle;
    }
    onSaveInstanceState(bundle);
}