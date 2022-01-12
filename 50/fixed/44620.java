public static void loadBitmap(android.content.Context context, android.widget.ImageView img, java.lang.String url) {
    com.bumptech.glide.Glide.with(context).load(url).asBitmap().into(img);
}