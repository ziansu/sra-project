@java.lang.Override
public void onClick(android.view.View view) {
    if (textview.getText().equals("")) {
        textview.setText(((ans) + "+"));
    }else
        if (!(isOperator(textview.getText().toString()))) {
            textview.append("+");
        }
    
    enterClear(enterPressed);
}