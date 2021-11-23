@java.lang.Override
public void onResourceReady(android.graphics.Bitmap resource, com.bumptech.glide.request.animation.GlideAnimation<? super android.graphics.Bitmap> glideAnimation) {
    mBitmaps.put(i, resource);
    refresh(i);
}