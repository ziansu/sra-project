@java.lang.Override
public android.graphics.drawable.Drawable getDrawable(android.content.Context context) {
    final android.graphics.drawable.AnimatedVectorDrawable d = ((android.graphics.drawable.AnimatedVectorDrawable) (super.getDrawable(context).getConstantState().newDrawable()));
    d.start();
    if (mAllowAnimation) {
        mAllowAnimation = false;
    }else {
        d.stop();
    }
    return d;
}