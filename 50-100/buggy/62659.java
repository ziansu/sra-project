public void onClick(android.view.View v) {
    if (android.text.TextUtils.isEmpty(mEditText.getText().toString())) {
        android.widget.Toast.makeText(this, "Input Field Must Be Filled In", Toast.LENGTH_SHORT).show();
    }else {
        java.lang.String pass = mEditText.getText().toString();
        android.widget.Toast.makeText(this, "Input Filled In", Toast.LENGTH_SHORT).show();
        android.content.Intent intent = new android.content.Intent(this, com.jackwilson.namemangler.MangledName.class);
        intent.putExtra("firstName", pass);
        startActivity(intent);
    }
}