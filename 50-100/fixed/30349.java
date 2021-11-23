@java.lang.Override
public void onClick(android.view.View v) {
    if ((value.length()) > 0) {
        value = value.substring(0, ((value.length()) - 1));
        if ((value.length()) == 0) {
            value = "0";
        }
        valueTextView.setText(value);
    }else {
        value = "0";
        valueTextView.setText(value);
    }
}