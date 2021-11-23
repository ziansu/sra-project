public void getAnNewInput(java.lang.String NewInput) {
    if (NewInput == "N") {
        input = (input) + "-";
    }else {
        input = (input) + NewInput;
    }
    inputData = (inputData) + NewInput;
    if ((input.length()) > 14) {
        resultView.setTextSize(12);
        if ((input.length()) > 33) {
            resultView.setText("Overthrow");
            return ;
        }
    }
    resultView.setText(input);
}