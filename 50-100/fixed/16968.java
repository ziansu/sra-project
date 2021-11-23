@java.lang.Override
public void onClick(android.view.View rootView) {
    tv1.setText("Enter bill amount: ");
    tv2.setText("Enter tip percentage: ");
    double answerOne = java.lang.Double.parseDouble(inputOne.getText().toString());
    double answerTwo = java.lang.Double.parseDouble(inputTwo.getText().toString());
    double calc;
    answerTwo *= 0.01;
    calc = answerOne + (answerOne * answerTwo);
    viewAnswer.setText((calc + ""));
}