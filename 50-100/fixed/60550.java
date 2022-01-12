@java.lang.Override
public void onSuccess(int statusCode, org.apache.http.Header[] headers, org.json.JSONObject response) {
    try {
        tokenHolder2 = response;
        java.lang.String resp = tokenHolder2.getString("result");
        if (resp.equals("success")) {
            mEmailView.setText(mEmailView.getText().toString());
            mPasswordView.setText(mPasswordView.getText().toString());
        }
    } catch (java.lang.Exception e) {
    }
}