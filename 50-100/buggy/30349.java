@java.lang.Override
public void onClick(android.view.View v) {
    if ((value.length()) > 0) {
        value = value.substring(0, ((value.length()) - 1));
        valueTextView.setText(value);
    }else {
        valueTextView.setText("0.00");
    }
}