private org.json.JSONArray getTeachers() throws java.io.IOException, me.vertretungsplan.exception.CredentialInvalidException, org.json.JSONException {
    final java.lang.String url = (api) + "/lehrer";
    if ((teachers) == null) {
        teachers = getJSONArray(url);
    }
    return teachers;
}