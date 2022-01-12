private void initView() {
    mPicPathStr = getIntent().getStringExtra(me.jp.picturecrop.ui.PictureCropActivity.PIC_PATH);
    if (!(android.text.TextUtils.isEmpty(mPicPathStr))) {
        mBitmap = me.jp.picturecrop.util.BitmapUtil.getSmallBitmap(mPicPathStr, 1080, 1920);
    }
    mClipImageLayout = ((me.jp.picturecrop.view.ClipImageLayout) (findViewById(R.id.id_clipImageLayout)));
    mClipImageLayout.setClipImage(new android.graphics.drawable.BitmapDrawable(mBitmap));
}