public void build() {
    turnPatternsToLinks();
    if ((links.size()) == 0) {
        return ;
    }
    for (com.klinker.android.link_builder.Link link : links) {
        addLinkToSpan(link);
    }
    textView.setText(spannable);
    addLinkMovementMethod();
}