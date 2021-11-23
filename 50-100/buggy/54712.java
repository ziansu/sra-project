@java.lang.Override
public void onClick(android.view.View view) {
    if ((lastop) == "=") {
        tv.setText("0.0");
        result = 0.0;
        lastop = null;
    }
    if ((java.lang.Double.parseDouble(tv.getText().toString())) == 0.0) {
        tv.setText("");
    }
    tv.append("0");
    lastpress = "num";
}