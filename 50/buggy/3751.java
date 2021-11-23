private void setReadFormatFileFilters(javax.swing.JFileChooser chooser) {
    setFormatFileFilters(chooser, slash.navigation.base.NavigationFormats.getReadFormatsSortedByName(), slash.navigation.converter.gui.panels.ConvertPanel.preferences.get(slash.navigation.converter.gui.panels.ConvertPanel.READ_FORMAT_PREFERENCE, slash.navigation.gpx.Gpx11Format.class.getName()));
}