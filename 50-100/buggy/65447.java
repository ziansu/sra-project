private void setImage(final android.content.Context ctx, final java.lang.String Image) {
    final android.widget.ImageView post_image = ((android.widget.ImageView) (mView.findViewById(R.id.postImage)));
    com.squareup.picasso.Picasso.with(ctx).load(Image).networkPolicy(NetworkPolicy.OFFLINE).into(post_image, new com.squareup.picasso.Callback() {
        @java.lang.Override
        public void onSuccess() {
        }

        @java.lang.Override
        public void onError() {
            com.squareup.picasso.Picasso.with(ctx).load(Image).into(post_image);
        }
    });
}