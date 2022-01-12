public void getNearestPoint(java.lang.String paramName, java.lang.String pointA) {
    java.lang.String nearestpoint = "";
    java.lang.StringBuffer sb = new java.lang.StringBuffer();
    if (uk.co.ordnancesurvey.gpx.graphhopper.IntegrationTestProperties.getTestPropertyBool("viaApigee")) {
        sb.append(uk.co.ordnancesurvey.gpx.graphhopper.IntegrationTestProperties.getTestProperty("graphHopperWebUrlViaApigee"));
    }else {
        sb.append(uk.co.ordnancesurvey.gpx.graphhopper.IntegrationTestProperties.getTestProperty("graphHopperWebUrl"));
    }
    sb.append("nearest?");
    sb.append((paramName + "="));
    sb.append(pointA);
    getRouteFromServiceWithParameters(sb);
}