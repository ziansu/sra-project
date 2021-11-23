@java.lang.Override
public void onClick(android.view.View v) {
    android.widget.Button b = ((android.widget.Button) (v));
    operator = b.getText().toString();
    operatorDisplayTextView.setText(operator);
    resultEditText.append(newNumberEditText.getText().toString());
    newNumberEditText.getText().clear();
}