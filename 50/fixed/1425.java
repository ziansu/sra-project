void numberPressed(long number) {
    runningNumber += java.lang.String.valueOf(number);
    resultView.setText(runningNumber);
}