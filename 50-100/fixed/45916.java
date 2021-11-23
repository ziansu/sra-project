@java.lang.Override
public void onClick(android.view.View v) {
    android.widget.TextView exp = ((android.widget.TextView) (findViewById(R.id.expression)));
    if ((exp.getText().toString().length()) > 0)
        exp.setText(exp.getText().toString().substring(0, ((exp.getText().length()) - 1)));
    
}