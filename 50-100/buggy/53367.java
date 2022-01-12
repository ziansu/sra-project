public java.lang.String exportTypeData(org.runnerup.export.format.GoogleFitData.DataSourceType source, long activityId, java.io.StringWriter w) {
    java.lang.String requestUrl = "";
    switch (source) {
        case ACTIVITY_SEGMENT :
            requestUrl = exportActivitySegments(source, activityId, w);
            return requestUrl;
        case ACTIVITY_SUMMARY :
            requestUrl = exportActivitySummary(source, activityId, w);
            return requestUrl;
        case ACTIVITY_LOCATION :
        case ACTIVITY_HEARTRATE :
        case ACTIVITY_SPEED :
        case LOCATION_SUMMARY :
        case HEARTRATE_SUMMARY :
        case SPEED_SUMMARY :
            requestUrl = exportSourceDataPoints(source, activityId, w);
            return requestUrl;
    }
    return requestUrl;
}