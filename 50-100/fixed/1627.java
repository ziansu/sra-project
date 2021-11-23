public void cancelSeat(int cancellationTime) throws asgn2Passengers.PassengerException {
    if ((((((this.isNew()) || (this.isQueued())) || (this.isRefused())) || (this.isFlown())) || (cancellationTime < 0)) || ((departureTime) < cancellationTime)) {
        throw new asgn2Passengers.PassengerException("Could not cancel seat of passenger.");
    }else {
        this.confirmed = false;
        this.newState = true;
        this.bookingTime = cancellationTime;
    }
}