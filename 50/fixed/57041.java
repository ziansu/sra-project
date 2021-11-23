private void initBitmap(int res) {
    if (res <= 0)
        return ;
    
    mBitmap = android.graphics.BitmapFactory.decodeResource(getResources(), res);
    mBitWidth = mBitmap.getWidth();
    mBitHeight = mBitmap.getHeight();
}