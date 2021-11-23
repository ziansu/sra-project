public void popBitmap() {
    if (stack.empty())
        return ;
    
    android.graphics.Bitmap bitmap = stack.pop();
    mReusableBitmaps.add(new java.lang.ref.SoftReference<android.graphics.Bitmap>(bitmap));
}