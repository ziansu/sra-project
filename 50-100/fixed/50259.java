public void anchorSchedule(time.datatypes.LogoTime time, java.lang.Double tickValue, time.TimeEnums.PeriodType tickType) {
    try {
        this.timeAnchor = new time.datatypes.LogoTime(time);
        this.tickType = tickType;
        this.tickValue = tickValue;
    } catch (org.nlogo.api.ExtensionException e) {
        e.printStackTrace();
    }
}