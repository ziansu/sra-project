public java.util.ArrayList<java.lang.String> listOfLapTimes() {
    java.util.ArrayList<java.lang.String> lapTimes = new java.util.ArrayList<java.lang.String>();
    if ((startTime.size()) != 0) {
        for (int i = 0; i < (finishTime.size()); i++) {
            lapTimes.add(getLapTime(i));
        }
    }
    return lapTimes;
}