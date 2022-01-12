@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    if (savedInstanceState != null) {
        if (!(mIgnoreFirstSavedState)) {
            com.owncloud.android.datamodel.OCFile file = savedInstanceState.getParcelable(com.owncloud.android.ui.preview.PreviewImageFragment.EXTRA_FILE);
            setFile(file);
        }else {
            mIgnoreFirstSavedState = false;
        }
    }
    if ((getFile()) == null) {
        throw new java.lang.IllegalStateException("Instanced with a NULL OCFile");
    }
    if (!(getFile().isDown())) {
        throw new java.lang.IllegalStateException("There is no local file to preview");
    }
}