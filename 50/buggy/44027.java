@android.databinding.BindingAdapter(value = { "bind:imageUrl" })
public static void loadImage(android.widget.ImageView view, java.lang.String imageUrl) {
    com.squareup.picasso.Picasso.with(view.getContext()).load(imageUrl).placeholder(R.drawable.list_item_bg).error(R.drawable.ic_broken_image).into(view);
}