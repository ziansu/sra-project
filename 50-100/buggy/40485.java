public static void imageView(final android.content.Context context, android.widget.ImageView imageView, java.lang.String url, int placehorder, int width, int height) {
    com.bumptech.glide.request.RequestOptions options = new com.bumptech.glide.request.RequestOptions();
    options.placeholder(placehorder);
    options.override(width, height);
    if (com.blankj.utilcode.util.ActivityUtils.isValidContext(context)) {
        com.bumptech.glide.Glide.with(context).load(url).apply(options).into(imageView);
    }
}