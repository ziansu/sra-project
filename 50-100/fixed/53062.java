private int getDayType(java.lang.String dateEnd) {
    int dayType;
    com.mypuredays.mypuredays.Day day = bl.getDay(dateEnd);
    if ((day != null) && ((day.get_dayTypeId()) != (Constants.DAY_TYPE.DEFAULT.ordinal()))) {
        return day.get_dayTypeId();
    }
    dayType = bl.getTypeOfDate("1980-01-01", dateEnd);
    if (dayType > 0) {
        return dayType;
    }
    return Constants.DAY_TYPE.DEFAULT.ordinal();
}