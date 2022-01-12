public void clearFutureReservations(java.time.LocalDateTime currentTime) {
    for (domain.ResourceType resourceType : getRequiredResources().keySet())
        resourceType.clearFutureReservations(currentTime, this);
    
}