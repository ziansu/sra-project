@java.lang.Override
protected void onPostExecute(java.lang.String s) {
    super.onPostExecute(s);
    taskTool.checkStatusAndReturnLogin(context, status);
    if (s.equals("FAIL"))
        android.util.Log.i("AddNewWordTask", "result = FAIL in onPostExecute");
    else {
        for (android.widget.EditText et : forEmptyList)
            et.setText("");
        
        android.widget.Toast.makeText(context, s, Toast.LENGTH_SHORT).show();
    }
}