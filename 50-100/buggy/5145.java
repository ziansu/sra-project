double calculateDistanceRatio(java.lang.String key) {
    double ratio = 0;
    if ((traveledDistance.containsKey(key)) && (traveledDistanceWithCust.containsKey(key))) {
        ratio = (traveledDistanceWithCust.get(key)) / (traveledDistance.get(key));
    }
    return ratio;
}