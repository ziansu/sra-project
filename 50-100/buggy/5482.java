public java.lang.Integer getRestingDays(pt.belele.project.data.Fixture nextFixture) {
    return org.joda.time.Days.daysBetween(getBeforeFixture(java.lang.Integer.valueOf(nextFixture.getSeason().getYear()), nextFixture.getDate(), null).getDate(), nextFixture.getDate()).getDays();
}