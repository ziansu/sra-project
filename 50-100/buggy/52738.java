public java.awt.Dimension getMinimumWindowDimension() {
    final java.awt.Dimension dimension = com.googlecode.cchlib.apps.duplicatefiles.prefs.util.Dimensions.toDimension(preferences.getMinimumWindowDimension());
    final java.awt.Dimension newDimension = fixMinDimension(dimension, com.googlecode.cchlib.apps.duplicatefiles.prefs.PreferencesControler.MINIMUM_WINDOW_WIDTH, com.googlecode.cchlib.apps.duplicatefiles.prefs.PreferencesControler.MINIMUM_WINDOW_HEIGHT);
    preferences.setMinimumWindowDimension(com.googlecode.cchlib.apps.duplicatefiles.prefs.util.Dimensions.toSerializableDimension(newDimension));
    return newDimension;
}