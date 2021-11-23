public void printPossibleSchedules() {
    for (model.Schedule schedule : possibleSchedules) {
        for (model.ClassSchedule classSchedule : schedule.classSchedules)
            java.lang.System.out.println(((schedule + ": ") + (classSchedule.teacher.name)));
        
        java.lang.System.out.println(schedule);
        java.lang.System.out.println("------------------------------------------------------------");
    }
}