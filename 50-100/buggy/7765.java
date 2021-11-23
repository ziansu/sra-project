private void askQuestions() {
    int idx = (firstaid_questions.size()) - (quesLen);
    if (idx < (firstaid_questions.size())) {
        app.speakOut(firstaid_questions.get(idx).getQues());
        expect_binary = true;
        current_grammar = app.BINARY_RESPONSE;
    }else {
        app.speakOut("Sorry. This is beyond my scope.");
        conclude = true;
    }
}