protected void sendEvent(de.dennismaass.emp.stonemaster.stackmaster.controller.comport.command.answer.ComAnswer answer) {
    for (de.dennismaass.emp.stonemaster.stackmaster.controller.comport.command.answer.ComAnswerListener listener : answerListener) {
        java.lang.System.out.println(("answer.getValue() " + (answer.getValue())));
        java.lang.System.out.println(("calculator.getCountOfDenominator(answer.getValue()) " + (calculator.getCountOfDenominator(answer.getValue()))));
        listener.handleAnswer(new de.dennismaass.emp.stonemaster.stackmaster.controller.comport.command.answer.ComAnswerEvent(this, answer, calculator.getCountOfDenominator(answer.getValue())));
    }
}