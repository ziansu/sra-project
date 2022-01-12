public void loadIconIntoView(android.content.Context context, android.widget.ImageView imageView) {
    java.lang.String iconUrl = getIconUrl();
    if (getBehaviors().isEmpty()) {
        if ((iconUrl != null) && (!(iconUrl.isEmpty()))) {
            org.tndata.android.compass.util.ImageCache.instance(context).loadBitmap(imageView, iconUrl, false);
        }
    }else {
        imageView.setImageResource(getProgressIcon());
    }
}