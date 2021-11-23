@java.lang.Override
public void onLayoutChange(android.view.View view, int i, int i1, int i2, int i3, int i4, int i5, int i6, int i7) {
    if ((profileImageView.getDrawable()) != null) {
        android.graphics.Bitmap bitmap = ((android.graphics.drawable.BitmapDrawable) (profileImageView.getDrawable())).getBitmap();
        profileBackground.setImageBitmap(kr.edcan.neologism.utils.SupportHelper.blur(bitmap, getApplicationContext()));
    }
}