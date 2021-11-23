private void initViews() {
    ivCarPart.setOnTouchImageViewListener(this);
    rvErrorPart.setHasFixedSize(true);
    rvErrorPart.setLayoutManager(new android.support.v7.widget.LinearLayoutManager(this));
    rvErrorPart.setItemAnimator(new android.support.v7.widget.DefaultItemAnimator());
    ivGuide.setOnClickListener(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View v) {
            showFullGuideImage();
        }
    });
    vn.com.toyota.checkdetail.utils.ImageUtils.showImage(this, R.drawable.toyota_logo, ivLogo);
}