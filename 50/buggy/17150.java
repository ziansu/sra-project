public void endLoadingProgress() {
    showUpdateUserSuccess();
    mLoadingDialog.cancel();
    android.content.Intent intent = getActivity().getIntent();
    getActivity().finish();
    startActivity(intent);
}