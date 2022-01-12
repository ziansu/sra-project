public void gradingChoise(java.lang.String clickValue) {
    if ((correctAnswer) != (-1)) {
        if (clickValue == (buttons[listButtonOrder.get(correctAnswer)].getName())) {
            stopTimeCount();
            correctChoiseBox();
            if (radioButtonAutoRestart.isSelected()) {
                createExpression();
            }
        }else
            if (clickValue != (buttons[listButtonOrder.get(correctAnswer)].getName())) {
                incorrectChoiseBox();
            }
        
    }
}