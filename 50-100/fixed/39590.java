public java.util.Collection<java.lang.Integer> getBookingsAt(int daysBeforeDeparture, java.lang.String flightNumber, java.lang.String cabinClass) {
    com.google.common.collect.Table<org.joda.time.DateTime, java.lang.Integer, java.lang.Integer> dateTimeIntegerIntegerTable = historicalBookings.get(getBookingKey(flightNumber, cabinClass));
    return dateTimeIntegerIntegerTable.column(daysBeforeDeparture).values();
}