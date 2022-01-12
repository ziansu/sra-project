@java.lang.Override
public void onClick(android.view.View view) {
    android.widget.Button b = ((android.widget.Button) (findViewById(R.id.btn_1)));
    boolean flag = calculator.insert(((java.lang.String) (b.getText())));
    if (flag) {
        android.widget.TextView txt_result1 = ((android.widget.TextView) (findViewById(R.id.txt_result1)));
        txt_result1.setText(calculator.toString());
    }else {
        android.util.Log.d("Main Activity:", b.toString());
    }
}