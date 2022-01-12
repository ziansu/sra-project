public java.lang.String[][] getEmployeeBookingAvailability(java.lang.String employeeId, java.util.Date date) {
    model.timetable.Timetable shiftsTimetable = utilities.getShift(employeeId);
    model.period.Booking[] bookings = utilities.getBookingsAfter(date);
    if (shiftsTimetable != null) {
        if ((bookings != null) && ((bookings.length) > 0)) {
            for (model.period.Booking b : bookings) {
                shiftsTimetable.removePeriod(b);
            }
        }
        return shiftsTimetable.toStringArray();
    }
    return null;
}