private void setMultiListLoadingMessage() {
    if ((emptyContentContainer) != null) {
        emptyContentHeadline.setText(R.string.file_list_loading);
        emptyContentMessage.setText("");
        emptyContentIcon.setVisibility(View.GONE);
        emptyContentMessage.setVisibility(View.GONE);
        multiListProgressBar.getIndeterminateDrawable().setColorFilter(com.owncloud.android.utils.ThemeUtils.primaryColor(), PorterDuff.Mode.SRC_IN);
        multiListProgressBar.setVisibility(View.VISIBLE);
    }
}