public static final void unbind(java.lang.Object source) {
    try {
        themeable.StyleBinder styleBinder = themeable.Themeable.findStyleBinderForClass(source.getClass());
        styleBinder.unbind(source);
        themeable.Themeable.bound = false;
    } catch (java.lang.Exception e) {
        android.util.Log.e(themeable.Themeable.TAG, "Failed to find binding class", e);
    }
}