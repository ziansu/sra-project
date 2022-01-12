@java.lang.Override
public void onStart() {
    super.onStart();
    if (web) {
        content.loadUrl(bookmark.getUrl());
    }else {
        java.lang.String readUrl = (com.pindroid.Constants.INSTAPAPER_URL) + (java.net.URLEncoder.encode(bookmark.getUrl()));
        content.loadUrl(readUrl);
    }
}