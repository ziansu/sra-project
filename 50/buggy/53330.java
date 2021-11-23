@java.lang.Override
public void onSuccess(android.graphics.Bitmap image) {
    ((android.widget.ImageView) (view.findViewById(R.id.addImg))).setImageBitmap(android.graphics.Bitmap.createScaledBitmap(image, image.getWidth(), 180, false));
    oldImageBitmap = image;
}