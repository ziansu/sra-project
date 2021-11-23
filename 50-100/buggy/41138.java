public static android.graphics.drawable.Drawable getDrawable(android.content.Context context, int resourceId) {
    android.graphics.drawable.Drawable drawable;
    if (slidenerd.vivz.bucketdrops.extras.Util.isLollipopOrMore()) {
        drawable = context.getResources().getDrawable(resourceId);
    }else {
        drawable = context.getDrawable(resourceId);
    }
    return drawable;
}