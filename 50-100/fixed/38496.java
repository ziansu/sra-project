void save() throws java.io.IOException {
    final java.util.Properties properties = new java.util.Properties();
    this.pp.populateProperties(this, properties);
    final java.io.File prefs = this.preferencesFile;
    com.googlecode.cchlib.util.properties.PropertiesHelper.saveProperties(prefs, properties, StringHelper.EMPTY);
    com.googlecode.cchlib.apps.duplicatefiles.prefs.PreferencesProperties.LOGGER.info(("Preferences saved in " + prefs));
}