public void resolveRoute() {
    try {
        activity.activityCloseLoadingBar();
        closeLoadingBar();
    } catch (java.lang.Exception e) {
        android.util.Log.e(Constants.TAG, "Error loading bar instance has not been created. in ActivityHelper resolveroute");
    }
    java.lang.String pendingDelivery = orderStatusDataBase.getOrderStatus();
    android.util.Log.d(Constants.TAG, "Checking value of pending delivery =  ");
    if (pendingDelivery == "") {
        activity.replaceFragment(R.layout.fragment_main, null);
    }else {
        android.util.Log.d(Constants.TAG, "Delivery status pending..");
        activity.replaceFragment(R.layout.fragment_order_status, null);
    }
}