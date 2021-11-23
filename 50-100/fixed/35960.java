@java.lang.Override
public android.graphics.drawable.Drawable getDrawable(android.content.Context context) {
    final android.graphics.drawable.Drawable d = super.getDrawable(context).getConstantState().newDrawable();
    if (d instanceof android.graphics.drawable.AnimatedVectorDrawable) {
        ((android.graphics.drawable.AnimatedVectorDrawable) (d)).start();
        if (mAllowAnimation) {
            mAllowAnimation = false;
        }else {
            ((android.graphics.drawable.AnimatedVectorDrawable) (d)).stop();
        }
    }
    return d;
}