public void setToDefaultDay() {
    this.type = de.opti4apps.timelytest.data.Day.DAY_TYPE.WORKDAY;
    this.start = new org.joda.time.DateTime(0, 1, 1, 9, 0);
    this.end = new org.joda.time.DateTime(0, 1, 1, 17, 0);
    this.pause = org.joda.time.Duration.standardMinutes(45);
}