@java.lang.Override
public void onRefresh() {
    cd = new com.rsproject.utils.ConnectionDetector(this);
    isInternetActive = cd.isConnectingToInternet();
    if (isInternetActive) {
        new com.rsproject.main.MainActivity.getListAll().execute();
    }else {
        android.widget.Toast.makeText(this, "Periksa Koneksi Internet Anda...!", Toast.LENGTH_LONG).show();
    }
}