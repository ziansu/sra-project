public void recalculateRouteDueToSettingsChange() {
    clearCurrentRoute(finalLocation, intermediatePoints);
    recalculateRouteInBackground(true, lastFixedLocation, finalLocation, intermediatePoints, currentGPXRoute, route, true, false);
}