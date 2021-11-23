private void setContent(com.czbix.v2ex.model.Topic topic) {
    final java.lang.String content = topic.getContent();
    if (com.google.common.base.Strings.isNullOrEmpty(content)) {
        mContent.setVisibility(View.GONE);
        return ;
    }
    mContent.setVisibility(View.VISIBLE);
    com.czbix.v2ex.util.ViewUtils.setHtmlIntoTextView(mContent, content, ((com.czbix.v2ex.util.ViewUtils.getWidthPixels()) - (com.czbix.v2ex.ui.adapter.TopicAdapter.ViewHolder.TOPIC_PICTURE_OTHER_WIDTH)));
}