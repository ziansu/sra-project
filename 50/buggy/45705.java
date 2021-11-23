@java.lang.Override
public void onBitmapFailed(android.graphics.drawable.Drawable errorDrawable) {
    SearchActivity.protectedFromGarbageCollectorTargets.remove(this);
    onBitmapFailed.run();
}