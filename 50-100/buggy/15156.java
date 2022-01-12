private void one(int size) {
    row1.setVisibility(View.VISIBLE);
    row2.setVisibility(View.GONE);
    frame1.setVisibility(View.VISIBLE);
    frame2.setVisibility(View.GONE);
    android.graphics.Bitmap bitmap = com.ashoksm.atozforkids.utils.DecodeSampledBitmapFromResource.execute(getResources(), imgResource, size, size);
    image1.setImageBitmap(bitmap);
    image1.setEnabled(true);
    image1.getLayoutParams().height = size;
    image1.getLayoutParams().width = size;
}