@org.junit.Test
public void testCalendarBasedTimeout() {
    for (java.util.TimeZone tz : org.jboss.as.ejb3.timer.schedule.CalendarBasedTimeoutTestCase.getTimezones()) {
        this.timezone = tz;
        this.timeZoneDisplayName = this.timezone.getDisplayName();
        testEverySecondTimeout();
        testEveryMinuteEveryHourEveryDay();
        testEveryMorningFiveFifteen();
        testEveryWeekdayEightFifteen();
        testEveryMonWedFriTwelveThirtyNoon();
        testEvery31stOfTheMonth();
        testRun29thOfFeb();
        testSomeSpecificTime();
        testEvery10Seconds();
    }
}