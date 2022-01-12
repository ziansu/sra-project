private void recoverLastSavedScheduleState() {
    java.util.List<java.util.List<com.example.peterchu.watplanner.Models.Schedule.CourseComponent>> recoveredSchedule = dataRepository.getCourseSchedules();
    if ((recoveredSchedule != null) && ((recoveredSchedule.size()) > 0)) {
        homeFragment.setCourseSchedule(recoveredSchedule);
    }else {
        generateScheduleForCalendar();
    }
}