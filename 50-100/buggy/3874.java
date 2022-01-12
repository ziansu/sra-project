public static void circleBorderImageView(final android.content.Context context, android.widget.ImageView imageView, java.lang.String url, int placehorder, float borderwidth, int bordercolor) {
    com.bumptech.glide.request.RequestOptions options = new com.bumptech.glide.request.RequestOptions();
    options.placeholder(placehorder).transform(new com.yc.english.base.helper.GlideCircleTransformation(context, borderwidth, bordercolor));
    if (com.blankj.utilcode.util.ActivityUtils.isValidContext(context)) {
        com.bumptech.glide.Glide.with(context).load(url).apply(options).into(imageView);
    }
}