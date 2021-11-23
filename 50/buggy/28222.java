public void removeDestination(com.CMPUT301W15T02.teamtoapp.Model.Destination destination) {
    if (currentClaim.getDestinations().contains(destination)) {
        currentClaim.getDestinations().remove(destination);
    }
}