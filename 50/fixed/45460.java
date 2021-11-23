public final android.content.res.Resources.Theme newTheme() {
    android.content.res.Resources.Theme theme = new android.content.res.Resources.Theme();
    theme.setImpl(mResourcesImpl.newThemeImpl());
    synchronized(mThemeRefs) {
        mThemeRefs.add(new java.lang.ref.WeakReference<>(theme));
    }
    return theme;
}