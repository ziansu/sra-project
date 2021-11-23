private void showcaseImage() {
    showcaseViewBuilder.setTargetView(imageView).setBackgroundOverlayColor(-296923827).setRingColor(-863072626).setRingWidth(15).setMarkerDrawable(getResources().getDrawable(android.R.drawable.arrow_down_float), Gravity.BOTTOM).setDrawableLeftMargin(16).addCustomView(R.layout.image_description_view, Gravity.BOTTOM).setHideOnTouchOutside(true).setCustomViewMargin(30);
    showcaseViewBuilder.show();
}