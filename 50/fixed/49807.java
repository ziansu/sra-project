public void isBooked(boolean input) throws CinemaTicketBookingSystem.WrongUserInputException {
    if ((this.isBooked) && input) {
        throw new CinemaTicketBookingSystem.WrongUserInputException("Sorry, the seat is not available.");
    }else {
        this.isBooked = input;
    }
}