public void showSettings() {
    settings.setVisibility(View.VISIBLE);
    mainLayout.bringChildToFront(settings);
    settings.onReturn = new com.taxibutler.pro.view.SettingsView.EventHandler() {
        @java.lang.Override
        public void handle() {
            settings.setVisibility(View.GONE);
        }
    };
    settings.onSettings = new com.taxibutler.pro.view.SettingsView.EventHandler() {
        @java.lang.Override
        public void handle() {
            showAdvancedSettings();
        }
    };
}