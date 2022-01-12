public java.util.LinkedList<java.lang.String> getTimeslots() {
    java.util.LinkedList<java.lang.String> timeSlots = new java.util.LinkedList<java.lang.String>();
    double t = startTime;
    int i = 0;
    while (t <= (endTime)) {
        timeSlots.set(i, timeDivide(t));
        if (java.lang.String.valueOf(t).endsWith(".30"))
            t += 0.7;
        else
            t += 0.3;
        
        ++i;
    } 
    return timeSlots;
}