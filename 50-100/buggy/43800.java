@java.lang.Override
protected void onPostExecute(com.team980.thunderscout.data.ScoutData o) {
    super.onPostExecute(o);
    if (o != null) {
        android.content.SharedPreferences prefs = android.preference.PreferenceManager.getDefaultSharedPreferences(context);
        if (prefs.getString("pref_serverStorageTask", "SAVE").equals("SAVE")) {
            com.team980.thunderscout.data.task.DatabaseWriteTask writeTask = new com.team980.thunderscout.data.task.DatabaseWriteTask(o, context);
            writeTask.execute();
        }else
            if (prefs.getString("pref_serverStorageTask", "SAVE").equals("SEND_SHEETS")) {
            }
        
    }else {
        android.util.Log.d("ServerConnectionTask", "Failed to start DatabaseWriteTask!");
    }
}