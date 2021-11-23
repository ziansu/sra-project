public void PassBill() {
    final android.widget.EditText edtBill = ((android.widget.EditText) (findViewById(R.id.et_bill)));
    android.content.SharedPreferences Billing = getApplicationContext().getSharedPreferences("Bill", com.example.jjcadiz.splitit.MODE_PRIVATE);
    android.content.SharedPreferences.Editor editor = getSharedPreferences("Bill", com.example.jjcadiz.splitit.MODE_PRIVATE).edit();
    float Bill = java.lang.Float.parseFloat(edtBill.getText().toString());
    editor.putFloat("Bill", Bill);
    editor.apply();
}