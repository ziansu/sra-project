private void initializeBackground() {
    android.widget.ImageView background = ((android.widget.ImageView) (findViewById(R.id.background)));
    background.setBackgroundColor(android.graphics.Color.rgb(0, 0, 0));
    com.bumptech.glide.Glide.with(this).load(R.raw.background).asGif().centerCrop().diskCacheStrategy(DiskCacheStrategy.SOURCE).into(background);
}