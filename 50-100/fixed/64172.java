private void setupAnimationDrawable() {
    android.graphics.drawable.AnimationDrawable animationDrawable = new android.graphics.drawable.AnimationDrawable();
    for (int index = 0; index < (bitmaps.size()); index++) {
        android.graphics.drawable.BitmapDrawable drawable = new android.graphics.drawable.BitmapDrawable(this.getResources(), bitmaps.get(index));
        animationDrawable.addFrame(drawable, (1000 / (framesPerSecond)));
    }
    animationDrawable.setOneShot(false);
    this.setImageDrawable(animationDrawable);
    animationDrawable.start();
}