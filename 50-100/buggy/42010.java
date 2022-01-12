public void displayPhoto(android.net.Uri uri) {
    android.widget.ImageView img;
    img = ((android.widget.ImageView) (getView().findViewById(R.id.display_image)));
    getView().findViewById(R.id.collageBgView).setOnTouchListener(new android.view.View.OnTouchListener() {
        @java.lang.Override
        public boolean onTouch(android.view.View view, android.view.MotionEvent event) {
            return true;
        }
    });
    img.setOnTouchListener(new com.thuytrinh.android.collageviews.MultiTouchListener());
    img.setImageURI(uri);
}