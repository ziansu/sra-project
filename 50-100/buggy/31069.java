private void setUpCurrentSemester() {
    java.lang.String currentSemesterString = mPreferences.getString(getString(R.string.current_semester), "");
    try {
        com.fasterxml.jackson.databind.ObjectMapper objectMapper = mNetworkManager.getObjectMapper();
        mCurrentSemester = objectMapper.readValue(currentSemesterString, new com.fasterxml.jackson.core.type.TypeReference<blueprint.com.sage.models.Semester>() {        });
    } catch (java.lang.Exception e) {
        android.util.Log.e(getClass().toString(), e.toString());
    }
}