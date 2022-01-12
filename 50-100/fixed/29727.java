@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_garrulo_main);
    mAdapter = com.glasstowerstudios.garrulo.tts.TTSAdapterFactory.getAdapter();
    mAdapter.init(this);
    startService(new android.content.Intent(this, com.glasstowerstudios.garrulo.service.GarruloListenerService.class));
    if (com.glasstowerstudios.garrulo.pref.GarruloPreferences.getPreferences().isSuppressDefaultNotificationSound()) {
        com.glasstowerstudios.garrulo.app.GarruloApplication.getInstance().suppressNotifications();
    }
}