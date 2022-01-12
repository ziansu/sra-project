private void setTypeFace() {
    android.widget.TextView titleTextView = null;
    try {
        java.lang.reflect.Field f = toolbar.getClass().getDeclaredField("mTitleTextView");
        f.setAccessible(true);
        titleTextView = ((android.widget.TextView) (f.get(toolbar)));
        android.graphics.Typeface face = android.graphics.Typeface.createFromAsset(getAssets(), "HelveticaNeue-Medium.ttf");
        titleTextView.setTypeface(face, Typeface.BOLD);
    } catch (java.lang.NoSuchFieldException e) {
    } catch (java.lang.IllegalAccessException e) {
    }
}