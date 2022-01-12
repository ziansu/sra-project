@java.lang.Override
public void onClick(android.view.View view) {
    if ((mTextView.getText().toString().length()) == 0) {
        mTextView.setText("");
    }else {
        operandOne = java.lang.Double.parseDouble(mTextView.getText().toString());
        mTextView.setText("");
        opp = '*';
        mTextView2.setText(((java.lang.Double.toString(operandOne)) + " * "));
    }
}