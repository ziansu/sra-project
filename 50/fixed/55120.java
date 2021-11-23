@java.lang.Override
public void onResume() {
    super.onResume();
    BleConnection = epsem.walkinghealth.BLEConnection.getInstance();
    BleConnection.addListener(this);
    writeFileManager = new epsem.walkinghealth.WriteFileManager(this);
}