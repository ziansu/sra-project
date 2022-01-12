@java.lang.Override
protected void onPostExecute(java.lang.Void aVoid) {
    if (((progressDialog) != null) && (progressDialog.isShowing()))
        progressDialog.dismiss();
    
    if (isCompleteSuccessfully)
        MainActivity.bus.post(resultList);
    
}