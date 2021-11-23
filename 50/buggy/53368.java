public boolean canTakeJob(rUBERn.Journey journey) {
    return (status.isAvailableForJob()) && ((journey.getPassengers()) <= (car.getPassengerCapacity()));
}