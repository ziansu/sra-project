protected java.lang.String setValue(org.eclipse.php.internal.ui.preferences.util.Key key, java.lang.String value) {
    if ((fDisabledProjectSettings) != null) {
        return fDisabledProjectSettings.put(key, value);
    }
    java.lang.String oldValue = getValue(key);
    key.setStoredValue(fLookupOrder[0], value, fManager);
    return oldValue;
}