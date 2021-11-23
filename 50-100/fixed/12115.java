public void myTick(long mils) {
    if ((mils % 1000) == 0) {
        int minsRemaining = ((int) (mils)) / 60000;
        int secsRemaining = (((int) (mils)) / 1000) % 60;
        java.lang.String time = ((java.lang.Integer.toString(minsRemaining)) + ":") + (java.lang.String.format("%02d", secsRemaining));
        timeRemaining.setText(time);
    }
    timeInMilis = mils;
}