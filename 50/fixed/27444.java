public void setVerboseLogging(boolean value) {
    io.flutter.settings.FlutterSettings.getPropertiesComponent().setValue(io.flutter.settings.FlutterSettings.verboseLoggingKey, value, false);
    fireEvent();
}