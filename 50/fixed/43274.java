public void feederPosition(double feederPos, long time) throws java.lang.InterruptedException {
    feeder.setPosition(feederPos);
    sleep(time);
    feeder.setPosition(0);
    sleep(time);
}