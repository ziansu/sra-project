@java.lang.Override
public void onClick(android.view.View view) {
    operandOne = java.lang.Double.parseDouble(mTextView.getText().toString());
    mTextView.setText("");
    opp = '*';
    mTextView2.setText(((java.lang.Double.toString(operandOne)) + " * "));
}