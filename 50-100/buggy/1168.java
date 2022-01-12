protected void onPostExecute(java.lang.String result) {
    if ((com.webwemser.letsmeetapp.MainActivity.meets.getMeets().size()) > 0) {
        showMeets(com.webwemser.letsmeetapp.MainActivity.meets.getMeets());
    }else {
        android.widget.Toast.makeText(this, getString(R.string.no_meets), Toast.LENGTH_SHORT).show();
    }
    swipeContainer.setRefreshing(false);
}