private void nextTask() {
    fromDecimalToBinary.convertToBinary();
    taskText.setText(" ");
    taskText.setText(((fromDecimalToBinary.getDecimalNumber()) + ""));
    answerString = "";
    answerText.setText(answerString);
}