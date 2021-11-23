protected void onPostExecute(java.lang.String result) {
    if (result.startsWith("Unable to")) {
        android.widget.Toast.makeText(getApplicationContext(), result, Toast.LENGTH_LONG).show();
        return ;
    }
    mHikeList = new java.util.ArrayList<>();
    result = watmok.tacoma.uw.edu.mylogin.hike.Hike.parseHikeJSON(result, mHikeList);
    if (result != null) {
        android.widget.Toast.makeText(getApplicationContext(), result, Toast.LENGTH_LONG).show();
        return ;
    }
}