@java.lang.Override
public void onRefresh() {
    if (SimpleOperations.INSTANCE.isNetworkAvailable(getApplicationContext())) {
        swipeRefreshLayout.setRefreshing(true);
        new com.raccoonapps.pricemanager.app.client.task.ProductsUpdateTask(null, productsFile, storeFile, getApplicationContext()).execute();
    }else {
        swipeRefreshLayout.setRefreshing(false);
        android.widget.Toast.makeText(this, "No WiFi connection available", Toast.LENGTH_SHORT).show();
    }
}