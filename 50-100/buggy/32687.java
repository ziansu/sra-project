@java.lang.Override
public void downloadAppPicture(com.amirgb.itunesappstest.DefaultActivity activity, android.widget.ImageView imageView, com.amirgb.itunesappstest.model.Image image) {
    if (hasConnection()) {
        com.amirgb.itunesappstest.rest.ItunesApiService itunesApiService = new com.amirgb.itunesappstest.rest.ItunesApiService();
        itunesApiService.postponeLoadPicture(imageView.getContext(), imageView, image, new com.squareup.picasso.Callback() {
            @java.lang.Override
            public void onSuccess() {
                android.support.v4.app.ActivityCompat.startPostponedEnterTransition(activity);
            }

            @java.lang.Override
            public void onError() {
                android.support.v4.app.ActivityCompat.startPostponedEnterTransition(activity);
            }
        });
    }
}