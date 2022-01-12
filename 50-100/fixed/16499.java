private org.json.JSONObject prepareDataElements(org.json.JSONObject data, org.json.JSONObject controlDataElements) throws java.lang.Exception {
    android.util.Log.d(org.eyeseetea.malariacare.network.PushClient.TAG, ("prepareDataElements for survey: " + (survey.getId_survey())));
    org.json.JSONArray values = prepareValues(new org.json.JSONArray(), null);
    values = prepareCompositeScores(values);
    data.put(org.eyeseetea.malariacare.network.PushClient.TAG_DATAVALUES, values);
    android.util.Log.d(org.eyeseetea.malariacare.network.PushClient.TAG, ("prepareDataElements result: " + (data.toString())));
    return data;
}