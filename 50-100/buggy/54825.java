public void onClickButtonSubmit(android.view.View view) {
    android.util.Log.i("Hello", "onClickButtonSubmit(View view)");
    android.widget.EditText editText = ((android.widget.EditText) (findViewById(R.id.edittext_name)));
    java.lang.String name = editText.getText().toString();
    android.util.Log.d("Hello", name);
    android.content.Intent intent = new android.content.Intent();
    intent.putExtra("name", name);
    setResult(com.emerckx.lab01.RESULT_OK, intent);
    finish();
}