public java.lang.String getDaynameOfWeek() {
    int d = this.calendar.get(Calendar.DAY_OF_WEEK);
    switch (d) {
        case 1 :
            return com.orientechnologies.orient.core.sql.method.intl.OCalendar.CAL_SUNDAY;
        case 2 :
            return com.orientechnologies.orient.core.sql.method.intl.OCalendar.CAL_MONDAY;
        case 3 :
            return com.orientechnologies.orient.core.sql.method.intl.OCalendar.CAL_TUESDAY;
        case 4 :
            return com.orientechnologies.orient.core.sql.method.intl.OCalendar.CAL_WEDNESDAY;
        case 5 :
            return com.orientechnologies.orient.core.sql.method.intl.OCalendar.CAL_THURSDAY;
        case 6 :
            return com.orientechnologies.orient.core.sql.method.intl.OCalendar.CAL_FRIDAY;
        case 7 :
            return com.orientechnologies.orient.core.sql.method.intl.OCalendar.CAL_SATURDAY;
    }
    return "";
}