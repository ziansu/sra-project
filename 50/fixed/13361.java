private nl.sjtek.sjtekcontrol.settings.UserSettings getUserSettings() {
    return nl.sjtek.sjtekcontrol.settings.SettingsManager.getInstance().getUserSettings().get(super.toString().toLowerCase());
}