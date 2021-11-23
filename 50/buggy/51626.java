@java.lang.Override
public void onResume() {
    super.onResume();
    tela.setImg(new android.graphics.drawable.BitmapDrawable(getResources(), imgBitmap));
}