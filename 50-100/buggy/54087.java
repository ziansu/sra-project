@java.lang.Override
public com.mark.model.FlightData getFlights(java.lang.String from, java.lang.String to, java.lang.String departureDateString, java.lang.String returnDateString, java.lang.Boolean forceBatchUsage) {
    java.util.Date departureDate = com.mark.util.converter.DateConverter.toDate(departureDateString);
    java.util.Date returnDate = com.mark.util.converter.DateConverter.toDate(returnDateString);
    com.mark.model.FlightData fd = this.getFlights(from, to, departureDate, returnDate, forceBatchUsage);
    com.mark.model.dal.FlightSavedSearch fss = new com.mark.model.dal.FlightSavedSearch();
    fd.setHistory(this.getAllFlightDataForSearch(fd));
    return fd;
}