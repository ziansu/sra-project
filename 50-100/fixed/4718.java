public static rx.Observable<com.objectivetruth.uoitlibrarybooking.data.models.calendarmodel.CalendarData> parseDataToGetClickableDateDetailsObs(android.support.v4.util.Pair<com.objectivetruth.uoitlibrarybooking.data.models.calendarmodel.CalendarData, java.lang.String[]> calendarDataStringPair) {
    try {
        return rx.Observable.just(com.objectivetruth.uoitlibrarybooking.data.models.calendarmodel.CalendarParser._parseDataToGetClickableDateDetails(calendarDataStringPair));
    } catch (java.lang.Throwable t) {
        timber.log.Timber.e(t, "Error parsing the Clickable Date pages for Grid info");
        return rx.Observable.error(t);
    }
}