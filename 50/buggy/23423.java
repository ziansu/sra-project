@java.lang.Override
public void loadImage(android.widget.ImageView imageView, java.lang.String url, int index) {
    com.bumptech.glide.Glide.with(this).load(url).into(imageView);
}