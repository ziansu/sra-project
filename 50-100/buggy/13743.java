@java.lang.Override
public void onRefresh() {
    android.util.Log.e("Checking OnRefresh", "inside on Refresh");
    if (isNetworkAvailable()) {
        android.util.Log.e("Checking OnRefresh", "inside IF ");
        com.example.raqib.instadate.MainActivity.SitesDownloadTask download = new com.example.raqib.instadate.MainActivity.SitesDownloadTask();
        download.execute();
    }else {
        mySwipeRefreshLayout.setRefreshing(false);
        android.util.Log.e("Checking OnRefresh", "inside ELSE");
        android.widget.Toast toast = android.widget.Toast.makeText(getApplicationContext(), "You Don't Have An Active Internet Connection, Please Connect With Internet And Try Again!", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }
}