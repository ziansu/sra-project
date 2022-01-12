private void createSettingsFile(java.io.File file) {
    doubleSettings = com.github.fishio.settings.Settings.getDefaultDoubleSettings();
    integerSettings = com.github.fishio.settings.Settings.getDefaultIntegerSettings();
    booleanSettings = com.github.fishio.settings.Settings.getDefaultBooleanSettings();
    keyCodeSettings = com.github.fishio.settings.Settings.getDefaultKeyCodeSettings();
    sliderSettings = com.github.fishio.settings.Settings.getDefaultSliderSettings();
    com.github.fishio.settings.YamlSettingWriter writer = new com.github.fishio.settings.YamlSettingWriter();
    writer.writeBooleanSettings(booleanSettings);
    writer.writeDoubleSettings(doubleSettings);
    writer.writeIntegerSettings(integerSettings);
    writer.writeKeyCodeSettings(keyCodeSettings);
    writer.writeSliderSettings(sliderSettings);
    writer.flush();
}