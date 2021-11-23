protected void robaRandomSleep(int minSleepSecond, int maxSleepSecond) {
    java.util.Random r = new java.util.Random();
    int sleepTime = (minSleepSecond + (r.nextInt((maxSleepSecond - minSleepSecond)))) * 1000;
    solo.sleep(sleepTime);
    android.util.Log.d(com.crazyroba.RobaActivityInstrumentationTestCase2.TAG, (("Roba random sleep " + sleepTime) + " s"));
}