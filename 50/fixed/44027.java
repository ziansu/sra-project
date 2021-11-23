@android.databinding.BindingAdapter(value = { "bind:imageUrl" })
public static void loadImage(android.widget.ImageView view, java.lang.String imageUrl) {
    com.squareup.picasso.Picasso.with(view.getContext()).load(imageUrl).into(view);
}