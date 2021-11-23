@java.lang.Override
protected void onResume() {
    super.onResume();
    com.cloudprint.CloudPrint.isNetworkOK(this);
}