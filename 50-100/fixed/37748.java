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
}