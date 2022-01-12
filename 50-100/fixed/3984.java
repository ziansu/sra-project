public java.util.LinkedList<java.lang.String> getTimeslots() {
    java.util.LinkedList<java.lang.String> timeSlots = new java.util.LinkedList<java.lang.String>();
    double t = startTime;
    while (t <= (endTime)) {
        if (java.lang.String.valueOf(t).endsWith(".30")) {
            timeSlots.add(timeDivide(t));
            t += 0.7;
        }else {
            timeSlots.add(timeDivide(t));
            t += 0.3;
        }
    } 
    return timeSlots;
}