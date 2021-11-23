workingDay[] generateDays(org.joda.time.LocalTime[] dayStartsAt, org.joda.time.LocalTime[] dayEndsAt) {
    workingDay[] days = new workingDay[dayStartsAt.length];
    for (int i = 0; i < (dayStartsAt.length); i++)
        days[i] = new workingDay(dayStartsAt[i], dayEndsAt[i]);
    
    return days;
}