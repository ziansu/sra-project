public void enterNumber(java.lang.String s) {
    if (firstNumFlag) {
        firstNum = "";
        firstNum += s;
        secondNum = "";
        function = "";
        firstNumFlag = false;
        tfAnswer.setText(firstNum);
    }else {
        if (function.equals("")) {
            firstNum += s;
            tfAnswer.setText(firstNum);
        }else {
            secondNum += s;
            tfAnswer.setText(secondNum);
        }
    }
}