public boolean updateBooking(model.Booking booking) {
    this.validate(booking);
    if (bookingDAO.updateBooking(booking)) {
        return true;
    }
    return false;
}