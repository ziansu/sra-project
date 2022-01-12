@java.lang.Override
public void estimateAnswer(java.lang.String answer) {
    if (answer == null)
        return ;
    
    usersAnswer = answer;
    if (answer.equals(possibleAnswers.get(answerId)))
        userScore = maxScore;
    
}