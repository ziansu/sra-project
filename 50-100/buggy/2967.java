private void initializeButtons() {
    android.widget.Button imageViewBtn = ((android.widget.Button) (this.findViewById(R.id.image_results_view_btn)));
    imageViewBtn.setEnabled(false);
    imageViewBtn.setOnClickListener(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View v) {
            android.content.Intent previewIntent = new android.content.Intent(neildg.com.eagleeyesr.ProcessingFromCamActivity.this, neildg.com.eagleeyesr.ImageViewActivity.class);
            startActivity(previewIntent);
        }
    });
}