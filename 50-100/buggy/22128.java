@java.lang.Override
protected void onPostExecute(org.fruct.oss.getssupplement.Model.BasicResponse response) {
    super.onPostExecute(response);
    if ((response.code) == 0)
        deleteMarker(getCurrentSelectedMarker());
    else {
        android.widget.Toast.makeText(getApplicationContext(), R.string.unsuccessful_edit, Toast.LENGTH_SHORT).show();
        return ;
    }
}