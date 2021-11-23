private void one(int height, int width) {
    row1.setVisibility(View.VISIBLE);
    row2.setVisibility(View.GONE);
    frame1.setVisibility(View.VISIBLE);
    frame2.setVisibility(View.GONE);
    android.graphics.Bitmap bitmap = com.ashoksm.atozforkids.utils.DecodeSampledBitmapFromResource.execute(getResources(), imgResource, width, height);
    image1.setImageBitmap(bitmap);
    image1.setEnabled(true);
    image1.getLayoutParams().height = height;
    image1.getLayoutParams().width = width;
}