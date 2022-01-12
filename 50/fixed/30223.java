@java.lang.Override
protected void onPostExecute(java.util.List<java.lang.String> results) {
    if (!(showToast))
        return ;
    
    for (java.lang.String result : results)
        android.widget.Toast.makeText(getApplication(), result, Toast.LENGTH_SHORT).show();
    
}