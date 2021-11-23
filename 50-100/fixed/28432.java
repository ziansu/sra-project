@java.lang.Override
protected void doAdvancedPost() throws BaseTable.InsertFailedException, Request.RequestException, org.json.JSONException {
    final java.lang.String empId = getHeaderSecurity().getEmployeeId();
    final java.lang.String lat = getStringParameter(LocationHistories.COLUMN_LATITUDE);
    final java.lang.String lon = getStringParameter(LocationHistories.COLUMN_LONGITUDE);
    final java.lang.String deviceTime = getStringParameter(LocationHistories.COLUMN_DEVICE_TIME);
    com.theah64.ets.api.database.tables.LocationHistories.getInstance().add(new com.theah64.ets.api.models.Location(null, empId, lat, lon, deviceTime));
    getWriter().write(new com.theah64.ets.api.utils.APIResponse("Location reported", null).getResponse());
}