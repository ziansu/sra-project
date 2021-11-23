public void confirmSeat(int confirmationTime, int departureTime) throws asgn2Passengers.PassengerException {
    if (((((this.isConfirmed()) || (this.isRefused())) || (this.isFlown())) || (confirmationTime < 0)) || (departureTime < confirmationTime)) {
        throw new asgn2Passengers.PassengerException("Can't confirm seat for passenger.");
    }else {
        this.newState = false;
        this.inQueue = false;
        this.confirmed = true;
        this.confirmationTime = confirmationTime;
        this.departureTime = departureTime;
    }
}