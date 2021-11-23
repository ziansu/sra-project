@java.lang.Override
public void onRefresh() {
    if (isNetworkAvailable()) {
        com.example.raqib.instadate.MainActivity.SitesDownloadTask download = new com.example.raqib.instadate.MainActivity.SitesDownloadTask();
        download.execute();
    }else {
        mySwipeRefreshLayout.setRefreshing(false);
        android.widget.Toast toast = android.widget.Toast.makeText(getApplicationContext(), "You Don't Have An Active Internet Connection, Please Connect With Internet And Try Again!", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }
}