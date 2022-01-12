@java.lang.Override
public void onSuccess(int statusCode, cz.msebera.android.httpclient.Header[] headers, org.json.JSONArray response) {
    if (response != null) {
        final java.util.ArrayList<com.chatak.parkinfiniamarket.Product> products = com.chatak.parkinfiniamarket.Product.fromJson(response);
        productAdapter.clear();
        for (com.chatak.parkinfiniamarket.Product product : products) {
            productAdapter.add(product);
        }
        productAdapter.notifyDataSetChanged();
    }
}