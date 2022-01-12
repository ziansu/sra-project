@java.lang.Override
protected java.util.List<android.graphics.Bitmap> doInBackground(java.lang.Void... params) {
    for (int i = 0; i < (mMediaList.size()); i++) {
        mBitmaps.add(com.easy.player.utils.VideoUtils.getThumbNail(mMediaList.get(i).path));
    }
    io.vov.vitamio.utils.Log.mlj(("size===" + (mBitmaps.size())));
    return mBitmaps;
}