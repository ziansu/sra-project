private void updateFolderList() {
    if ((mRetainedFolderFragment) == null) {
        mRetainedFolderFragment = com.quartzodev.fragments.FolderListFragment.newInstance(mUser.getUid());
        android.support.v4.app.FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(mFolderListContainer.getId(), mRetainedFolderFragment);
        transaction.commit();
    }
}