public static void statusText(java.lang.String status) {
    com.convenienttech.ldsreverentmode.MainActivity.text.setText(status);
    if ((com.convenienttech.ldsreverentmode.MainActivity.mode) == 1) {
        com.convenienttech.ldsreverentmode.MainActivity.ringer.setText("Vibrate");
    }else
        if ((com.convenienttech.ldsreverentmode.MainActivity.mode) == 2) {
            com.convenienttech.ldsreverentmode.MainActivity.ringer.setText("Normal");
        }
    
}