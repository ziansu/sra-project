public void isBooked(boolean input) throws CinemaTicketBookingSystem.WrongUserInputException {
    if (this.isBooked) {
        throw new CinemaTicketBookingSystem.WrongUserInputException("Sorry, the seat is not available.");
    }else {
        this.isBooked = input;
    }
}