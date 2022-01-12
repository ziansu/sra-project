@java.lang.Override
public void onClick(android.view.View v) {
    android.widget.Button b = ((android.widget.Button) (v));
    operator = b.getText().toString();
    operatorDisplayTextView.setText(operator);
    if (!(newNumberEditText.getText().toString().isEmpty())) {
        resultEditText.setText(newNumberEditText.getText().toString());
        newNumberEditText.getText().clear();
    }
}