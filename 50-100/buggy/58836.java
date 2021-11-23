private void initImageCallback(final anabolicandroids.chanobol.api.data.Post post, final anabolicandroids.chanobol.ui.posts.PostsActivity.ImageCallback cb) {
    anabolicandroids.chanobol.ui.posts.OnClickListener l = new anabolicandroids.chanobol.ui.posts.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View v) {
            imageTouchOverlay.postDelayed(new java.lang.Runnable() {
                @java.lang.Override
                public void run() {
                    cb.onClick(post, image);
                }
            }, anabolicandroids.chanobol.ui.scaffolding.UiActivity.RIPPLE_DELAY());
        }
    };
    imageTouchOverlay.setOnClickListener(l);
    image.setOnClickListener(l);
}