private void setWriteFormatFileFilters(javax.swing.JFileChooser chooser) {
    setFormatFileFilters(chooser, getWriteFormatsWithPreferredFormats(recentFormatsModel.getFormats()), slash.navigation.converter.gui.panels.ConvertPanel.preferences.get(slash.navigation.converter.gui.panels.ConvertPanel.WRITE_FORMAT_PREFERENCE, slash.navigation.gpx.Gpx11Format.class.getName()));
}