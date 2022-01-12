private void parseJson(org.json.JSONArray array) throws org.json.JSONException {
    for (int i = 0; i < (array.length()); ++i) {
        com.valxp.app.infiniteflightwatcher.model.Users.User temp = new com.valxp.app.infiniteflightwatcher.model.Users.User(array.getJSONObject(i));
        com.valxp.app.infiniteflightwatcher.model.Users.User user = mUsers.get(temp.mId);
        if (user != null) {
            user.set(temp);
        }else {
            mUsers.put(temp.getId(), temp);
        }
    }
}