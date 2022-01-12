public boolean match(schmitt_florian.schoolplanner.logic.Period otherPeriod) {
    return ((((this.id) == (otherPeriod.id)) && ((this.schoolHourNo) == (otherPeriod.schoolHourNo))) && (this.startTime.equals(otherPeriod.startTime))) && (this.endTime.equals(otherPeriod.endTime));
}