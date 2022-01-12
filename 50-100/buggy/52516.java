@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if (requestCode == (fr.machada.gathabaandroid.MainActivity.REPO_REQUEST)) {
        if (resultCode == (RESULT_OK)) {
            java.lang.Boolean result = data.getBooleanExtra(BundleKeys.FOLLOW, false);
            if (result) {
                registerRepo(mRepo);
                mRepo.setIsFollowed(true);
                mAdapter.notifyDataSetChanged();
            }else {
                deleteRepo(mRepo);
                mRepo.setIsFollowed(false);
                mAdapter.notifyDataSetChanged();
            }
        }
    }
}