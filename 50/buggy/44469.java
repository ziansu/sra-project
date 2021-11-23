public void setEnd(java.util.Date end) {
    this.end = end;
    this.upperBound = models.Event.makeUpperBound(end);
}