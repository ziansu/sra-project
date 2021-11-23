public void addTaskFunction(schooltasklist.pega.com.connection.IOnGetDataFromServerComplete listener, long groupID, java.lang.String nameTask, java.lang.String date, java.util.List<schooltasklist.pega.com.model.User> users) throws org.json.JSONException {
    org.json.JSONObject jsonQuery = schooltasklist.pega.com.connection.MessageParse.addTaskQuery(groupID, nameTask, date, users);
    new schooltasklist.pega.com.connection.AsyncTaskConnect(listener, jsonQuery).execute();
}