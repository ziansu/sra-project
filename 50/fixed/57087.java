private java.time.LocalTime getRealArrivalTime() {
    return scheduledArrival.plus(delay);
}