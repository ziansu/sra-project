public void loadImage(android.net.Uri uri, java.lang.String chanName, java.lang.String key, android.widget.ImageView imageView, boolean fromCacheOnly) {
    loadImage(uri, chanName, key, new com.mishiranu.dashchan.content.ImageLoader.SimpleCallback(imageView), fromCacheOnly);
}