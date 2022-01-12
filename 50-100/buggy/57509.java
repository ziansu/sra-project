public void addAnswer(java.lang.String data, boolean isCorrect, com.example.murk.kwizgeeq.model.AnswerType answerType) {
    com.example.murk.kwizgeeq.model.Answer answer = new com.example.murk.kwizgeeq.model.Answer(isCorrect, data, answerType);
    if (answer == null)
        throw new java.lang.NullPointerException();
    
    if (answers.add(answer)) {
        if (answer.isCorrect())
            (correctAnswerCount)++;
        else
            (wrongAnswerCount)++;
        
    }
    if (answerType == (AnswerType.IMAGE)) {
        EventBusWrapper.BUS.post(this);
    }
}