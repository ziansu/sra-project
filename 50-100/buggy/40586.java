@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    android.os.Bundle bundle = data.getExtras();
    java.lang.String s = bundle.getString("result");
    authCode.setText(s);
    java.lang.String x = s.toLowerCase();
}