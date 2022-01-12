@java.lang.Override
public void onClick(android.view.View v) {
    if ((savedAnswers) == null)
        return ;
    
    savedAnswers[((currentQuestionNum) - 1)] = "No";
    (currentQuestionNum)++;
    if ((currentQuestionNum) > (numQuestions)) {
        saveAnsersToPref();
        goToMyBallotListener.goToMyBallot();
    }else
        displayContent(currentQuestionNum, '?');
    
}