protected java.lang.String getValue(org.eclipse.php.internal.ui.preferences.util.Key key) {
    if (((fDisabledProjectSettings) != null) && ((fDisabledProjectSettings.get(key)) != null)) {
        return ((java.lang.String) (fDisabledProjectSettings.get(key)));
    }
    return key.getStoredValue(fLookupOrder, false, fManager);
}