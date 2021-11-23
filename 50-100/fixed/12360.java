@java.lang.Override
public java.lang.String getIsoDate(org.hisp.dhis.calendar.DateTimeUnit dateTimeUnit, org.hisp.dhis.calendar.Calendar calendar) {
    int month = dateTimeUnit.getMonth();
    switch (month) {
        case 11 :
            return (dateTimeUnit.getYear()) + "NovS1";
        case 5 :
            return (dateTimeUnit.getYear()) + "NovS2";
        default :
            throw new java.lang.IllegalArgumentException(("Month not valid [11,5] " + month));
    }
}