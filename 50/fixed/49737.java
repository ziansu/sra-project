public void addMemberFunction(schooltasklist.pega.com.connection.IOnGetDataFromServerComplete listener, long groupID, java.util.List<schooltasklist.pega.com.model.User> users) throws java.lang.Exception, org.json.JSONException {
    org.json.JSONObject jsonQuery = schooltasklist.pega.com.connection.MessageParse.addMemberQuery(groupID, users);
    new schooltasklist.pega.com.connection.AsyncTaskConnect(listener, jsonQuery).execute();
}