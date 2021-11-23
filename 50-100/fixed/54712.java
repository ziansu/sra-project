@java.lang.Override
public void onClick(android.view.View view) {
    if ((lastop) == "=") {
        tv.setText("0.0");
        result = 0.0;
        lastop = null;
    }
    if (tv.getText().toString().equals("0.0")) {
        tv.setText("");
    }
    tv.append("0");
    lastpress = "num";
}