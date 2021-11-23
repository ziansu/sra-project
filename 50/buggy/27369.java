public void setStart(java.util.Date start) {
    this.start = start;
    this.lowerBound = models.Event.makeLowerBound(start);
}