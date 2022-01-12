public void scheduling(java.util.ArrayList<Student> TCs, java.util.ArrayList<Office> offices) {
    for (Office office : offices) {
        for (Day day : Day.values()) {
            for (Student s1 : TCs) {
                s1.hoursPerDay = 0;
            }
            getLongestShift(TCs, office, day, highThresh);
            fillDayOfficeReq(TCs, office, day);
        }
    }
}