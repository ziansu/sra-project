@java.lang.Override
public void onResponse(com.android.volley.toolbox.ImageLoader.ImageContainer imageContainer, boolean b) {
    android.graphics.Bitmap bitmap = imageContainer.getBitmap();
    if (bitmap != null) {
        android.support.v7.graphics.Palette p = android.support.v7.graphics.Palette.generate(bitmap, 12);
        mMutedColor = p.getDarkMutedColor(-13421773);
        mPhotoView.setImageBitmap(imageContainer.getBitmap());
        mRootView.findViewById(R.id.meta_bar).setBackgroundColor(mMutedColor);
    }
}