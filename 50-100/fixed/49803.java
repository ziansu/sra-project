public void retrieveJourney(final dk.au.ProjectContext.activities.Journey journey) {
    final int locationSampleTime = getResources().getInteger(R.integer.locationSampleTime);
    final int nearbyStopDistanceThreshold = getResources().getInteger(R.integer.nearbyStopDistanceThreshold);
    this.modeller = new dk.au.ProjectContext.modelling.Modeller(this, journey, weather, locationSampleTime, nearbyStopDistanceThreshold);
    this.currentJourney = journey;
    this.nextStop = currentRoute.first();
    updateDisplay();
    showAction(overrideNextAction);
}