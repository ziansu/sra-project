@java.lang.Override
public void onClick(android.view.View v) {
    if ((actionLocation) != (-1)) {
        double value = java.lang.Double.valueOf(vickenkrikorian.calculator.Calculator.solve(java.lang.String.valueOf(input.getText())));
        actionLocation = -1;
        solution = true;
        del.setText("Clear");
        input.setText(java.lang.Double.toString(value));
        input.setSelection(input.getText().length());
    }
}