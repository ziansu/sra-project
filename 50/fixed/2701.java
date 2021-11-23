@java.lang.Override
public void onFailure(java.lang.String url) {
    getBaseActivity().runOnUiThread(new java.lang.Runnable() {
        public void run() {
            hideLoadingAnimation();
            showError(R.string.msg_img_loading_error);
        }
    });
    hideLoadingAnimation();
}