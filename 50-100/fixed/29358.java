public void scheduling(java.util.ArrayList<Student> TCs, java.util.ArrayList<Office> offices) {
    for (Office office : offices) {
        for (Day day : Day.values()) {
            getLongestShift(TCs, office, day, highThresh);
            fillDayOfficeReq(TCs, office, day);
        }
    }
}