@java.lang.Override
public void onClick(android.view.View v) {
    calculation();
    currentAction = v.getContentDescription().toString();
    expressionField.setText(((decimalFormat.format(valueOne)) + (currentAction)));
    resultField.setText(null);
}