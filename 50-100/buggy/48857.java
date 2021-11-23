private void setContent(com.czbix.v2ex.model.Notification notification) {
    final java.lang.String content = notification.mContent;
    if (com.google.common.base.Strings.isNullOrEmpty(content)) {
        mContent.setVisibility(View.GONE);
        return ;
    }
    mContent.setVisibility(View.VISIBLE);
    com.czbix.v2ex.util.ViewUtils.setHtmlIntoTextView(mContent, content, ((com.czbix.v2ex.util.ViewUtils.getWidthPixels()) - (com.czbix.v2ex.ui.adapter.NotificationAdapter.ViewHolder.TOPIC_PICTURE_OTHER_WIDTH)));
}