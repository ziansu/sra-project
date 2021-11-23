@java.lang.Override
protected void onPostExecute(org.json.JSONArray words) {
    super.onPostExecute(words);
    taskTool.checkStatusAndReturnLogin(context, status);
    wordList.setAdapter(new networkThread.FetchAndSearchTask.WordAdapter(context));
}