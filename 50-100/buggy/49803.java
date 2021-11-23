public void retrieveJourney(final dk.au.ProjectContext.activities.Journey journey) {
    final int locationSampleTime = getResources().getInteger(R.integer.locationSampleTime);
    final int nearbyStopDistanceThreshold = getResources().getInteger(R.integer.nearbyStopDistanceThreshold);
    this.currentJourney = journey;
    this.modeller = new dk.au.ProjectContext.modelling.Modeller(this, currentJourney, weather, locationSampleTime, nearbyStopDistanceThreshold);
    this.nextStop = currentRoute.first();
    updateDisplay();
    showAction(overrideNextAction);
}