private void loadResources() {
    android.widget.Button mImageUploadButton = ((android.widget.Button) (view.findViewById(R.id.image_similar_select_button)));
    mImageUploadButton.setOnClickListener(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View view) {
            android.util.Log.i("BUTTON", "debug 1");
            selectImageDialog();
        }
    });
    mMainImage = view.findViewById(R.id.image_rec_image_preview);
}