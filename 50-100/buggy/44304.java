public void gradingChoise(java.lang.String clickValue) {
    if (clickValue == (buttons[listButtonOrder.get(correctAnswer)].getName())) {
        stopTimeCount();
        correctChoiseBox();
        if (radioButtonAutoRestart.isSelected()) {
            createExpression();
        }
    }else {
        incorrectChoiseBox();
    }
}