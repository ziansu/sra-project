public java.lang.Class[][] makeSchedule(int credits) {
    int currentSemester = 0;
    int semesterCounter = 0;
    schedule = new java.lang.Class[100][];
    while (!(allTaken(com.android.coursescheduler.Schedule.classes))) {
        java.lang.Class[] sem = getSemester(credits, currentSemester, semesterCounter);
        currentSemester++;
        currentSemester %= 3;
        schedule[semesterCounter] = sem;
        semesterCounter++;
    } 
    schedule = resize(schedule);
    return schedule;
}