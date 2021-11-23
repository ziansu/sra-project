@java.lang.Override
public void onBindViewHolder(org.chromium.chrome.browser.ntp.cards.NewTabPageListItem article) {
    org.chromium.chrome.browser.ntp.snippets.SnippetArticle item = ((org.chromium.chrome.browser.ntp.snippets.SnippetArticle) (article));
    mHeadlineTextView.setText(item.mTitle);
    mPublisherTextView.setText(java.lang.String.format(org.chromium.chrome.browser.ntp.snippets.SnippetArticleViewHolder.PUBLISHER_FORMAT_STRING, item.mPublisher, android.text.format.DateUtils.getRelativeTimeSpanString(item.mTimestamp, java.lang.System.currentTimeMillis(), DateUtils.MINUTE_IN_MILLIS)));
    mArticleSnippetTextView.setText(item.mPreviewText);
    mUrl = item.mUrl;
    mAmpUrl = item.mAmpUrl;
    mPosition = item.mPosition;
    updateThumbnail(item);
    updateFavicon(item);
}