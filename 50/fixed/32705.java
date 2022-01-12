private synchronized void updateTime() {
    currentTime.addSeconds(1);
    java.lang.System.out.println(currentTime);
    checkEvents();
}