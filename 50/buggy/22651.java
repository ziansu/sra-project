public static void refreshListenerStatus() {
    com.example.cekke.activity_recognition_original.MainActivity.bandStatus = com.example.cekke.activity_recognition_original.MainActivity.checkAllStatus();
    com.example.cekke.activity_recognition_original.MainActivity.phoneStatus = false;
    com.example.cekke.activity_recognition_original.MainActivity.bandStatus = false;
    com.example.cekke.activity_recognition_original.MainActivity.beaconStatus = false;
    com.example.cekke.activity_recognition_original.MainActivity.resetAllStatus();
}