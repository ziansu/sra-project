public long minus(org.yashasvi.calender4j.core.classes.Time B) {
    return (((((this.hour) - (B.hour)) * (Constants.MICROSECONDS_IN_HOUR)) + (((this.minute) - (B.minute)) * (Constants.MICROSECONDS_IN_MINUTE))) + (((this.second) - (B.second)) * (Constants.MICROSECONDS_IN_SECOND))) + ((this.microsecond) - (B.microsecond));
}