@java.lang.Override
public void onClick(android.view.View v) {
    if ((edtBill.getText().toString().length()) == 0) {
        android.widget.Toast.makeText(getApplicationContext(), "EMPTY FIELD", Toast.LENGTH_LONG).show();
    }else {
        PassBill();
        SplitButton.setProgress(100);
        android.widget.Toast.makeText(getApplicationContext(), "Bill Splitted, go Back", Toast.LENGTH_SHORT).show();
    }
}