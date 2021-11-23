public static void loadImageFromResourcesToImageView(android.content.Context context, int resourceId, android.widget.ImageView imageView) {
    com.squareup.picasso.Picasso.with(context).load(resourceId).fit().into(imageView);
}