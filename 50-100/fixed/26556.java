@java.lang.Override
public void setPreferenceScreen(android.support.v7.preference.PreferenceScreen preferenceScreen) {
    if ((preferenceScreen != null) && (!(preferenceScreen.isAttached()))) {
        preferenceScreen.setShouldUseGeneratedIds(mAnimationAllowed);
    }
    super.setPreferenceScreen(preferenceScreen);
    if (preferenceScreen != null) {
        if ((mHeader) != null) {
            preferenceScreen.addPreference(mHeader);
        }
        if ((mFooter) != null) {
            preferenceScreen.addPreference(mFooter);
        }
    }
}