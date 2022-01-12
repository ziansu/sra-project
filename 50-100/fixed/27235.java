private void loadContentFromSavedPage() {
    android.util.Log.v(org.wikipedia.page.linkpreview.LinkPreviewDialog.TAG, "Loading link preview from Saved Pages");
    new org.wikipedia.savedpages.LoadSavedPageTask(pageTitle) {
        @java.lang.Override
        public void onFinish(org.wikipedia.page.Page page) {
            if (!(isAdded())) {
                return ;
            }
            displayPreviewFromCachedPage(page);
        }

        @java.lang.Override
        public void onCatch(java.lang.Throwable caught) {
            if (!(isAdded())) {
                return ;
            }
            progressBar.setVisibility(View.GONE);
            org.wikipedia.util.FeedbackUtil.showMessage(getActivity(), R.string.error_network_error);
            dismiss();
        }
    }.execute();
}