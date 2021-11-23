public boolean checkAnswer(javax.swing.JTextField textField) {
    int userNum = java.lang.Integer.valueOf(textField.getText());
    if (userNum == (answer)) {
        correct = true;
    }
    java.lang.System.out.println(correct);
    return correct;
}