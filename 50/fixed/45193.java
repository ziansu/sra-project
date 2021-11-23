public void recalculateRouteDueToSettingsChange() {
    clearCurrentRoute(finalLocation, intermediatePoints);
    recalculateRouteInBackground(lastFixedLocation, finalLocation, intermediatePoints, currentGPXRoute, route, true, false);
}