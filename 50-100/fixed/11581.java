private java.lang.String getTransitTitle(org.opentripplanner.api.model.Leg leg) {
    java.lang.String[] possibleTitles = new java.lang.String[]{ leg.routeShortName , leg.route , leg.routeId };
    for (int i = 0; i < (possibleTitles.length); i++) {
        if (!(android.text.TextUtils.isEmpty(possibleTitles[i]))) {
            return possibleTitles[i];
        }
    }
    return null;
}