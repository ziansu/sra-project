public int compareTo(schedule.CourseMoment moment2) {
    if (this.getStartTime().before(moment2.getStartTime())) {
        return -1;
    }
    if (this.getStartTime().after(moment2.getStartTime())) {
        return 1;
    }
    return 0;
}