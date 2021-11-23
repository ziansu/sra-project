private void showEmptyViewWithMessage(org.wordpress.android.ui.media.MediaGridFragment.MessageId messageId) {
    int stringId = 0;
    switch (messageId) {
        case LOADING :
            stringId = R.string.loading_media;
            break;
        case NO_CONTENT :
            stringId = R.string.media_empty_list;
            break;
        case NETWORK_ERROR :
            stringId = R.string.network_error;
            break;
        case PERMISSION_ERROR :
            stringId = R.string.media_error_no_permission;
            break;
        case NO_CONTENT_CUSTOM_DATE :
            stringId = R.string.media_empty_list_custom_date;
            break;
    }
    mEmptyView.setVisibility(View.VISIBLE);
    mEmptyViewTitle.setText(getResources().getString(stringId));
}