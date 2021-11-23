public java.util.List<com.okcity.okcity.recording.Report> getNearbyReports(android.location.Location location, int milesRadius) {
    android.util.Log.i(com.okcity.okcity.browsing.BrowseFragment.TAG, "Get nearby reports");
    java.lang.String longitude = java.lang.String.valueOf(location.getLongitude());
    java.lang.String latitude = java.lang.String.valueOf(location.getLatitude());
    java.lang.String radius = java.lang.String.valueOf(milesRadius);
    java.lang.String[] params = new java.lang.String[]{ longitude , latitude , radius };
    new com.okcity.okcity.browsing.BrowseFragment.RetrieveReportsTask().execute(params);
    return null;
}