@java.lang.Override
public void onSuccess(int statusCode, org.apache.http.Header[] headers, org.json.JSONObject response) {
    try {
        tokenHolder2 = response;
        java.lang.String resp = tokenHolder2.getString("result");
        if (resp.equals("success")) {
            mEmailView.setText(mEmailView2.getText().toString());
            mPasswordView.setText(mPasswordView2.getText().toString());
            mEmailView2.setText("");
            mPasswordView2.setText("");
        }
    } catch (java.lang.Exception e) {
    }
}