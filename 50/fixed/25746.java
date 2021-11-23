private android.graphics.drawable.AnimationDrawable getMultAnim() {
    if ((multiplier.getBackground()) instanceof android.graphics.drawable.AnimationDrawable)
        return ((android.graphics.drawable.AnimationDrawable) (multiplier.getBackground()));
    
    return null;
}