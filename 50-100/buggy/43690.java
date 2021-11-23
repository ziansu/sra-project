@java.lang.Override
protected void onActivityResult(final int requestCode, final int resultCode, @javax.annotation.Nullable
final android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    android.util.Log.i(com.greenaddress.greenbits.ui.MnemonicActivity.TAG, ("" + data));
    final android.widget.EditText edit = ((android.widget.EditText) (findViewById(R.id.mnemonicText)));
    if ((data != null) && ((data.getStringExtra("com.greenaddress.greenbits.QrText")) != null)) {
        edit.setText(data.getStringExtra("com.greenaddress.greenbits.QrText"));
        login();
    }
}