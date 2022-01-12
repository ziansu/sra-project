@java.lang.Override
protected void onPostExecute(java.lang.String result) {
    pbLoading.setVisibility(View.GONE);
    if (!(android.text.TextUtils.isEmpty(result))) {
        try {
            java.lang.String joke = extractJokeFromJson(result);
            tvChuck.setText(joke);
        } catch (org.json.JSONException e) {
            e.printStackTrace();
            tvChuck.setText(getString(R.string.result_empty));
        }
    }
    tvChuck.setText(getString(R.string.result_empty));
}