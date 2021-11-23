@android.databinding.BindingAdapter(value = "bind:imageUri")
public static void loadImage(final android.widget.ImageView imageView, android.net.Uri uri) {
    if (uri == null)
        return ;
    
    com.bumptech.glide.Glide.with(imageView.getContext()).load(uri.toString()).asBitmap().placeholder(R.mipmap.ic_launcher).into(imageView);
}