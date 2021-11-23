public java.lang.String[][] getEmployeeBookingAvailability(java.lang.String employeeId, java.util.Date date) {
    model.timetable.Timetable shiftsTimetable = utilities.getShift(employeeId);
    model.period.Booking[] bookings = utilities.getBookingsAfter(date);
    if ((bookings != null) && ((bookings.length) > 0))
        for (model.period.Booking b : bookings)
            shiftsTimetable.removePeriod(b);
        
    
    if (shiftsTimetable != null)
        return shiftsTimetable.toStringArray();
    
    return null;
}