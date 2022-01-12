@java.lang.Override
protected void onPostExecute(java.lang.String result) {
    super.onPostExecute(result);
    dlg.dismiss();
    if (result.contains("true")) {
        updateTeacherLogIn(result);
    }else
        if (result.contains("false")) {
        }
    
}