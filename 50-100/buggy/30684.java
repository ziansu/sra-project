@java.lang.Override
public void onSuccess(int statusCode, cz.msebera.android.httpclient.Header[] headers, org.json.JSONObject response) {
    try {
        org.json.JSONArray docs = null;
        if (response != null) {
            docs = new org.json.JSONArray(response);
            final java.util.ArrayList<com.chatak.parkinfiniamarket.Product> products = com.chatak.parkinfiniamarket.Product.fromJson(docs);
            productAdapter.clear();
            for (com.chatak.parkinfiniamarket.Product product : products) {
                productAdapter.add(product);
            }
            productAdapter.notifyDataSetChanged();
        }
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
}