public void moveFrontBeacon() throws java.lang.InterruptedException {
    FrontBeaconPusher.setPosition(0.9);
    java.lang.Thread.sleep(1000);
    FrontBeaconPusher.setPosition(0.15);
}