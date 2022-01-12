@java.lang.Override
public void onResourceReady(java.io.File resource, com.bumptech.glide.request.animation.GlideAnimation<? super java.io.File> glideAnimation) {
    addSticker(android.graphics.BitmapFactory.decodeFile(resource.getAbsolutePath()));
}