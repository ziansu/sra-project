public void build() {
    if ((links.size()) == 0) {
        return ;
    }
    turnPatternsToLinks();
    for (com.klinker.android.link_builder.Link link : links) {
        addLinkToSpan(link);
    }
    textView.setText(spannable);
    addLinkMovementMethod();
}