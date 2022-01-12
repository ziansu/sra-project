@java.lang.Override
public void loadImage(android.widget.ImageView imageView, int index) {
    com.bumptech.glide.Glide.with(this).load(list.get(index)).into(imageView);
}