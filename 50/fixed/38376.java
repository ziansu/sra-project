@java.lang.Override
public void onError() {
    com.squareup.picasso.Picasso.with(context).load(url).into(tempImageView, new com.squareup.picasso.Callback() {
        @java.lang.Override
        public void onSuccess() {
        }

        @java.lang.Override
        public void onError() {
        }
    });
}