@java.lang.Override
protected void onCreated() {
    setContentView(R.layout.activity_main);
    startTime = (java.lang.System.currentTimeMillis()) - 5000;
    if (App.preferences.getBoolean("Encoded", false))
        EncryptVocabs();
    
}