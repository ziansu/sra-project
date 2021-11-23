@java.lang.Override
public org.micromanager.display.DisplaySettings copySettings(org.micromanager.display.DataViewer sourceDisplay, org.micromanager.display.DisplaySettings source, org.micromanager.display.DisplaySettings dest) {
    int sourceIndex = getIndex(sourceDisplay, source);
    org.micromanager.display.DisplaySettings.ContrastSettings oldSettings = dest.getSafeContrastSettings(channelIndex_, org.micromanager.display.internal.DefaultDisplayManager.getInstance().getContrastSettings(0, 0, 1.0, null));
    org.micromanager.display.DisplaySettings.ContrastSettings newSettings = source.getSafeContrastSettings(sourceIndex, null);
    if (oldSettings == newSettings) {
        return dest;
    }
    org.micromanager.display.DisplaySettings.DisplaySettingsBuilder builder = dest.copy();
    builder.safeUpdateContrastSettings(newSettings, channelIndex_);
    return builder.build();
}