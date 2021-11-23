@java.lang.Override
protected java.lang.Void doInBackground(java.lang.Void... params) {
    com.leontheprofessional.test.whorepresentsyou.jsonparsing.WhoRepresentsYouApi whoRepresentsYouApi = new com.leontheprofessional.test.whorepresentsyou.jsonparsing.WhoRepresentsYouApi();
    try {
        members.clear();
        members = whoRepresentsYouApi.getAllMemberByZipCode(this, zipCode);
        android.util.Log.v(com.leontheprofessional.test.whorepresentsyou.MainActivity.LOG_TAG, ("members: " + (members.get(1).getName())));
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    } catch (java.net.MalformedURLException e) {
        e.printStackTrace();
    }
    return null;
}