@java.lang.Override
protected void onPostExecute(java.lang.String s) {
    super.onPostExecute(s);
    if (taskTool.checkStatusAndReturnLogin(context, status))
        return ;
    
    if (s.equals("FAIL"))
        android.util.Log.i("AddNewWordTask", "result = FAIL in onPostExecute");
    else {
        for (android.widget.EditText et : forEmptyList)
            et.setText("");
        
        android.widget.Toast.makeText(context, s, Toast.LENGTH_SHORT).show();
    }
}