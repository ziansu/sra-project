@java.lang.Override
public void onClick(android.view.View v) {
    SplitButton.setProgress(100);
    if ((edtBill.getText().toString().length()) == 0) {
        android.widget.Toast.makeText(getApplicationContext(), "EMPTY FIELD", Toast.LENGTH_LONG).show();
    }else {
        PassBill();
        android.widget.Toast.makeText(getApplicationContext(), "Bill Splitted, go Back", Toast.LENGTH_SHORT).show();
    }
}