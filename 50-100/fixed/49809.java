public static android.content.Intent createShareWebIntent(java.lang.String url, java.lang.String title, android.graphics.Bitmap favicon, android.graphics.Bitmap thumbnail) {
    android.content.Intent intent = new android.content.Intent(android.content.Intent.ACTION_SEND);
    intent.setType("text/plain");
    intent.putExtra(Intent.EXTRA_TEXT, url);
    if (title != null)
        intent.putExtra(Intent.EXTRA_SUBJECT, title);
    
    if (favicon != null)
        intent.putExtra("share_favicon", favicon);
    
    if (thumbnail != null)
        intent.putExtra("share_screenshot", thumbnail);
    
    return intent;
}