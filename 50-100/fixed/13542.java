public void refusePassenger(int refusalTime) throws asgn2Passengers.PassengerException {
    if (((((this.isConfirmed()) || (this.isRefused())) || (this.isFlown())) || (refusalTime < 0)) || (refusalTime < (bookingTime))) {
        throw new asgn2Passengers.PassengerException("Could not refuse passenger.");
    }else {
        this.newState = false;
        this.inQueue = false;
        this.refused = true;
    }
}