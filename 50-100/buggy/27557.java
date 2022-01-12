@java.lang.Override
public void onClick(android.view.View v) {
    android.widget.TextView tv = ((android.widget.TextView) (findViewById(R.id.num_disp)));
    if ((tv.getText()) != "") {
        num1 = ((java.lang.String) (tv.getText()));
        tv.setText("");
        p = '*';
    }
}