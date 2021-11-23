private void displayPreviewFromCachedPage(org.wikipedia.page.Page page) {
    if (!(isAdded())) {
        android.util.Log.d(org.wikipedia.page.linkpreview.LinkPreviewDialog.TAG, "Detached from activity, so stopping update.");
        return ;
    }
    progressBar.setVisibility(View.GONE);
    contents = new org.wikipedia.page.linkpreview.LinkPreviewContents(page);
    layoutPreview();
}