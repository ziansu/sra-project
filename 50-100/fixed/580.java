public void flyPassenger(int departureTime) throws asgn2Passengers.PassengerException {
    if (((((this.isNew()) || (this.isQueued())) || (this.isRefused())) || (this.isFlown())) || (departureTime <= 0)) {
        throw new asgn2Passengers.PassengerException("Cannot fly passenger.");
    }else {
        this.confirmed = false;
        this.flown = true;
        this.departureTime = departureTime;
    }
}