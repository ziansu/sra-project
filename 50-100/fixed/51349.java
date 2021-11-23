public org.json.JSONObject toJSON() throws org.json.JSONException {
    org.json.JSONObject jsonObject = new org.json.JSONObject();
    jsonObject.put(com.example.qiao.crimeaction.crime.JSON_ID, mId.toString());
    jsonObject.put(com.example.qiao.crimeaction.crime.JSON_DATE, mDate.toString());
    jsonObject.put(com.example.qiao.crimeaction.crime.JSON_TITLE, mTitle);
    jsonObject.put(com.example.qiao.crimeaction.crime.JSON_SOLVED, mSloved);
    jsonObject.put(com.example.qiao.crimeaction.crime.JSON_IMAGE, mimageStore);
    return jsonObject;
}