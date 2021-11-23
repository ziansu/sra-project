@java.lang.Override
public void onFinalImageSet(java.lang.String id, @javax.annotation.Nullable
final com.facebook.imagepipeline.image.ImageInfo imageInfo, @javax.annotation.Nullable
android.graphics.drawable.Animatable animatable) {
    if (imageInfo != null) {
        eventDispatcher.dispatchEvent(new com.reactnative.photoview.ImageEvent(getId(), com.facebook.react.common.SystemClock.nanoTime(), ImageEvent.ON_LOAD));
        eventDispatcher.dispatchEvent(new com.reactnative.photoview.ImageEvent(getId(), com.facebook.react.common.SystemClock.nanoTime(), ImageEvent.ON_LOAD_END));
        update(imageInfo.getWidth(), imageInfo.getHeight());
    }
}