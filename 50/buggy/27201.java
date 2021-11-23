public void setPin(int GPIO, java.lang.Boolean pinValue) {
    if (connected) {
        new org.catrobat.catroid.devices.raspberrypi.RaspberryPiImpl.asyncSetPin().execute(java.lang.Integer.toString(GPIO), java.lang.Boolean.toString(pinValue));
    }
}