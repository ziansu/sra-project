public int compareTo(schedule.CourseMoment moment2) {
    if (this.getStartTime().before(moment2.getDate())) {
        return -1;
    }
    if (this.getStartTime().after(moment2.getDate())) {
        return 1;
    }
    return 0;
}