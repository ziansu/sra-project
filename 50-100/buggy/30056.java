public boolean isInPeriod(int startWeek, int endWeek) {
    return ((((this.startWeek) >= startWeek) && ((this.startWeek) <= endWeek)) || (((this.endWeek) >= startWeek) && ((this.endWeek) <= endWeek))) || (((this.startWeek) <= startWeek) && ((this.endWeek) >= endWeek));
}