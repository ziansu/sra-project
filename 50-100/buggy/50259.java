public void anchorSchedule(time.datatypes.LogoTime time, java.lang.Double tickValue, time.TimeEnums.PeriodType tickType) {
    try {
        this.timeAnchor = new time.datatypes.LogoTime(time);
        this.tickType = tickType;
        this.tickValue = tickValue;
        this.tickCounter = ((org.nlogo.nvm.ExtensionContext) (TimeExtension.context)).workspace().world().tickCounter;
    } catch (org.nlogo.api.ExtensionException e) {
        e.printStackTrace();
    }
}