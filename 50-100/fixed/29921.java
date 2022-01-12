public static void loadImage(android.content.Context context, final android.widget.ImageView target, java.lang.String url) {
    com.bumptech.glide.Glide.with(context).load((url == null ? R.drawable.ic_launcher_round_web : url)).asBitmap().placeholder(R.mipmap.ic_launcher_round).diskCacheStrategy(DiskCacheStrategy.RESULT).into(new com.bumptech.glide.request.target.SimpleTarget<android.graphics.Bitmap>() {
        @java.lang.Override
        public void onResourceReady(android.graphics.Bitmap arg0, com.bumptech.glide.request.animation.GlideAnimation<? super android.graphics.Bitmap> arg1) {
            target.setImageBitmap(arg0);
        }
    });
}