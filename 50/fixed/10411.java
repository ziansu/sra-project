public void loadImage(android.net.Uri uri, java.lang.String chanName, java.lang.String key, boolean fromCacheOnly, android.widget.ImageView imageView) {
    loadImage(uri, chanName, key, new com.mishiranu.dashchan.content.ImageLoader.SimpleCallback(imageView), fromCacheOnly);
}