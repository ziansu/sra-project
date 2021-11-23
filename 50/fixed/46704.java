public static void loadWriteImg(android.content.Context context, final android.widget.ImageView img, final com.aoliao.notebook.utils.entity.Write.Content content) {
    com.bumptech.glide.Glide.with(context).load(content.getImg()).diskCacheStrategy(DiskCacheStrategy.NONE).into(img);
}