@java.lang.Override
protected void onPostExecute(org.json.JSONArray words) {
    super.onPostExecute(words);
    if (taskTool.checkStatusAndReturnLogin(context, status))
        return ;
    
    wordList.setAdapter(new networkThread.FetchAndSearchTask.WordAdapter(context));
}