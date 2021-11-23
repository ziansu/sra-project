@java.lang.Override
protected void onPostExecute(android.support.v4.util.Pair<java.lang.Integer, biweekly.io.text.ICalReader> response) {
    if ((response.first) != 200) {
        android.widget.Toast.makeText(getContext().getApplicationContext(), getResources().getString(R.string.connection_problems), Toast.LENGTH_LONG).show();
    }else {
        parseICalReader(response.second);
    }
    workInProgress = false;
    progressBar.setVisibility(View.GONE);
}