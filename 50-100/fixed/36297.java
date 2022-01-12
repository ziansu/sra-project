public void onClick(android.view.View view) {
    android.util.Log.v("EditText", mEdit.getText().toString());
    android.content.Intent intent = new android.content.Intent(this, com.qr_maker.backchannel.qr_maker.DisplayCodeActivity.class);
    android.widget.EditText editText = ((android.widget.EditText) (findViewById(R.id.editText)));
    startActivity(intent);
}