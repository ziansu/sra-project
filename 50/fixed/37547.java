public static void load(android.content.Context context, java.lang.String path, android.widget.ImageView imageView) {
    com.bumptech.glide.Glide.with(context).load(path).into(imageView);
}