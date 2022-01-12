private java.lang.String worstTime() {
    java.util.ArrayList<java.lang.Long> arrayListTemp = new java.util.ArrayList<>();
    for (long i : arrayListTimes) {
        if (i > 0) {
            arrayListTemp.add(i);
        }
    }
    if ((arrayListTemp.size()) == 0) {
        return "Worst: " + "0";
    }
    return "Worst: " + (com.example.tom.timer.TimerTime.convertMillisToTime(java.util.Collections.max(arrayListTemp)));
}