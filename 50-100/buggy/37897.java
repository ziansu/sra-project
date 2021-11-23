@java.lang.Override
public void onClick(android.view.View v) {
    if (textView.getText().toString().equals("_")) {
        textView.setText("");
    }
    if (textViewSum.getText().toString().equals("")) {
        textView.append(".");
        buttonDecimal.setEnabled(false);
        disableAll();
    }else {
        clearCalc();
    }
}