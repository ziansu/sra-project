@android.databinding.BindingAdapter(value = "bind:imageUri")
public static void loadImage(final android.widget.ImageView imageView, android.net.Uri uri) {
    if (uri == null)
        return ;
    
    java.lang.String path = com.toandoan.luatgiaothong.utils.binding.BindingUtils.getPathFromUri(imageView.getContext(), uri);
    com.bumptech.glide.Glide.with(imageView.getContext()).load(new java.io.File(path)).asBitmap().placeholder(R.mipmap.ic_launcher).into(imageView);
}