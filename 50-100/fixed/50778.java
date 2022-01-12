public void loadNew(org.sufficientlysecure.keychain.ui.ImportKeysListFragment.LoaderState loaderState) {
    mLoaderState = loaderState;
    if ((mLoaderState) instanceof org.sufficientlysecure.keychain.ui.ImportKeysListFragment.BytesLoaderState) {
        org.sufficientlysecure.keychain.ui.ImportKeysListFragment.BytesLoaderState ls = ((org.sufficientlysecure.keychain.ui.ImportKeysListFragment.BytesLoaderState) (mLoaderState));
        if (((ls.mDataUri) != null) && (!(checkAndRequestReadPermission(ls.mDataUri)))) {
            return ;
        }
    }
    restartLoaders();
}