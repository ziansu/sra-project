public void embark() {
    if ((state) == (Train.TrainState.stopped))
        synchronized(currentStation.passengers) {
            for (Passenger passenger : new java.util.ArrayList(currentStation.passengers)) {
                if (passenger.destination.equals(getTrainDestination())) {
                    for (Seat seat : seats) {
                        if (!(seat.isOccuped())) {
                            seat.passenger = passenger;
                            currentStation.passengers.remove(passenger);
                        }
                    }
                    start = isReadyToDepart();
                }
            }
        }
    
}