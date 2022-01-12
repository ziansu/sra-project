@java.lang.Override
public void into(android.widget.ImageView imageView) {
    com.bumptech.glide.DrawableRequestBuilder drawableRequestBuilder = build();
    this.imageview = imageView;
    drawableRequestBuilder.into(imageview);
}