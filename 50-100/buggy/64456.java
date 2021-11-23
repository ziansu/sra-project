public void disableService() {
    serviceEnabled_lay.setBackgroundColor(Color.RED);
    serviceEnabled_tv.setText(R.string.service_disabled);
    serviceEnabled_iv.setImageBitmap(null);
    serviceEnabled_iv.setImageResource(R.drawable.service_disabled);
    serviceEnabled_iv.setScaleType(ImageView.ScaleType.FIT_XY);
    serviceEnabled_iv.setPadding(50, 50, 50, 50);
    serviceEnabled_tv.setPadding(20, 20, 20, 20);
}