public boolean hasTimeConflict(CoursePlanner.ScheduleMaker.FutureCourse.TimeInterval other) {
    for (java.time.DayOfWeek day : this.days)
        for (java.time.DayOfWeek otherDay : other.days) {
            if ((((this.getTotalStartTimeInMinute()) <= (other.getTotalStartTimeInMinute())) && ((this.getTotalEndTimeInMinute()) >= (other.getTotalStartTimeInMinute()))) && (day == otherDay))
                return true;
            
        }
    
    return false;
}