@java.lang.Override
public void onClick(android.view.View view) {
    boolean flag = calculator.insert("0");
    if (flag) {
        android.widget.TextView txt_result1 = ((android.widget.TextView) (findViewById(R.id.txt_result1)));
        txt_result1.setText(calculator.toString());
    }
}