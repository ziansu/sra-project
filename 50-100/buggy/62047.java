public workingDay[] generateDays(org.joda.time.LocalTime[] dayStartsAt, org.joda.time.LocalTime[] dayEndsAt) {
    workingDay[] days = new workingDay[]{  };
    for (int i = 0; i < (this.totalNumberOfDays); i++)
        days[i] = new workingDay(dayStartsAt[i], dayEndsAt[i]);
    
    return days;
}