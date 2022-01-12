protected java.lang.String doInBackground(java.lang.String... args) {
    android.util.Log.d("DEL", ("DELMEX2=" + (meeting.getName())));
    java.util.List<org.apache.http.NameValuePair> params = new java.util.ArrayList<>();
    params.add(new org.apache.http.message.BasicNameValuePair(Resources.TAG_MEETING_NAME, meeting.getName()));
    jsonParser.makeHttpRequest(url_delete_meeting, "POST", params);
    return null;
}