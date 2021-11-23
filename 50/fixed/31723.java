private boolean connectDataKit() {
    dataKitHandler = org.md2k.utilities.datakit.DataKitHandler.getInstance(getApplicationContext());
    return dataKitHandler.connect(new org.md2k.datakitapi.messagehandler.OnConnectionListener() {
        @java.lang.Override
        public void onConnected() {
            autoSensePlatforms.register();
            startAutoSense();
        }
    });
}