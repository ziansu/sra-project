@java.lang.Override
public void resetTheme() {
    if (jp.hazuki.yuzubrowser.settings.data.ThemeData.isEnabled()) {
        setColorSchemeColors(jp.hazuki.yuzubrowser.settings.data.ThemeData.getInstance().progressColor);
        if (jp.hazuki.yuzubrowser.settings.data.ThemeData.getInstance().refreshUseDark) {
            setProgressBackgroundColorSchemeColor(android.support.v4.content.res.ResourcesCompat.getColor(getResources(), R.color.deep_gray, getContext().getTheme()));
        }
    }else {
        setColorSchemeResources(R.color.accent);
    }
}