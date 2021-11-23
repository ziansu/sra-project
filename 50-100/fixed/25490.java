@java.lang.Override
protected void onPostExecute(org.json.JSONObject result) {
    super.onPostExecute(result);
    mProgressDialog.dismiss();
    try {
        if ((result != null) && (result.getString("STATUS").equalsIgnoreCase("SUCCESS"))) {
            onPromoCodeSuccess(result);
        }else {
            onPromoCodeFail(result);
        }
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
}