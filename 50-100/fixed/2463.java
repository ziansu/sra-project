private java.lang.String bestTime() {
    java.util.ArrayList<java.lang.Long> arrayListTemp = new java.util.ArrayList<>();
    for (long i : arrayListTimes) {
        if (i > 0) {
            arrayListTemp.add(i);
        }
    }
    if ((arrayListTemp.size()) == 0) {
        return "Best: " + "0";
    }
    return "Best: " + (com.example.tom.timer.TimerTime.convertMillisToTime(java.util.Collections.min(arrayListTemp)));
}