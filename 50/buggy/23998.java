private void requestNewInterstitial() {
    adRequest = new com.google.android.gms.ads.AdRequest.Builder().addTestDevice("4E441F0D2F1FEBCDB67463195D4E85A2").addTestDevice(AdRequest.DEVICE_ID_EMULATOR).build();
}