@java.lang.Override
protected void onResume() {
    super.onResume();
    if ((org.multibluetooth.multibluetooth.MainMenu.MainMenuActivity.btLaserCon) == null) {
        org.multibluetooth.multibluetooth.MainMenu.MainMenuActivity.btLaserCon = new org.multibluetooth.multibluetooth.Driving.Bluetooth.LaserScan.LaserScanner(this);
    }
    ((org.multibluetooth.multibluetooth.Driving.Bluetooth.LaserScan.LaserScanner) (org.multibluetooth.multibluetooth.MainMenu.MainMenuActivity.btLaserCon)).setupService();
}