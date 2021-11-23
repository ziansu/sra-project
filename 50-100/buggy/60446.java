@java.lang.Override
public void onSuccess(int statusCode, cz.msebera.android.httpclient.Header[] headers, org.json.JSONObject response) {
    mActivity.showLoading(false);
    android.util.Log.d("minh", ("GET_CUSTOMERS_URL: " + response));
    if (com.app.restfulapp.ultis.Parser.isSuccess(response)) {
        mAdapCus.setData(com.app.restfulapp.ultis.Parser.parseCustomers(response.optJSONArray("Result"))).notifyDataSetChanged();
    }else {
        android.widget.Toast.makeText(mActivity, com.app.restfulapp.ultis.Parser.getError(response), Toast.LENGTH_SHORT).show();
    }
}