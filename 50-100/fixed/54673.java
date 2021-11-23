@java.lang.Override
public void onClick(android.view.View v) {
    android.util.Log.v(com.leontheprofessional.test.whorepresentsyou.MainActivity.LOG_TAG, "FAB clicked");
    android.support.v4.app.ActivityCompat.requestPermissions(this, new java.lang.String[]{ android.Manifest.permission.ACCESS_FINE_LOCATION }, GeneralConstant.MY_PERMISSION_REQUST_ACCESS_FINE_LOCATION);
    if (com.leontheprofessional.test.whorepresentsyou.helper.GeneralHelper.isNetworkConnectionAvailable(this)) {
        locationTracker = new com.leontheprofessional.test.whorepresentsyou.service.LocationTracker(this);
        refreshPage(getIntent());
    }else {
        android.widget.Toast.makeText(this, getString(R.string.network_unavailable), Toast.LENGTH_SHORT).show();
    }
}