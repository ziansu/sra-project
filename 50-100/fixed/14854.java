@java.lang.Override
public in.buzzzz.model.Model parse(org.json.JSONObject json) throws org.json.JSONException {
    buzzPreview.setStatus(json.getInt(ApiDetails.RESPONSE_KEY_STATUS));
    buzzPreview.setMessage(json.getString(ApiDetails.RESPONSE_KEY_MESSAGE));
    if ((buzzPreview.getStatus()) == (in.buzzzz.utility.ApiDetails.STATUS_SUCCESS)) {
        org.json.JSONObject dataJsonObject = json.getJSONObject(ApiDetails.RESPONSE_KEY_DATA);
        buzzParser(dataJsonObject);
    }
    return buzzPreview;
}