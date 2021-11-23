public static void loadImage(android.content.Context context, final android.widget.ImageView target, android.net.Uri uri) {
    com.bumptech.glide.Glide.with(context).load((uri == null ? R.drawable.ic_launcher_round_web : uri)).asBitmap().placeholder(R.mipmap.ic_launcher_round).diskCacheStrategy(DiskCacheStrategy.RESULT).into(new com.bumptech.glide.request.target.SimpleTarget<android.graphics.Bitmap>() {
        @java.lang.Override
        public void onResourceReady(android.graphics.Bitmap arg0, com.bumptech.glide.request.animation.GlideAnimation<? super android.graphics.Bitmap> arg1) {
            target.setImageBitmap(arg0);
        }
    });
}