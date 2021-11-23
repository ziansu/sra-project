private void readAttributes(android.util.AttributeSet attrs) {
    pawSetting = attrs.getAttributeValue(de.fun2code.android.piratebox.preference.CustomServerSettingEditTextPreference.PIRATEBOX_NAMESPACE, "setting");
    isNumeric = ((attrs.getAttributeValue(de.fun2code.android.piratebox.preference.CustomServerSettingEditTextPreference.ANDROID_NAMESPACE, "numeric")) != null) ? true : false;
    try {
        numericDivider = java.lang.Long.valueOf(attrs.getAttributeValue(de.fun2code.android.piratebox.preference.CustomServerSettingEditTextPreference.PIRATEBOX_NAMESPACE, "numericDivider"));
    } catch (java.lang.Exception e) {
        numericDivider = null;
    }
}