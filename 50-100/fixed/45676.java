private void nextQuizSet() {
    (currentSet)++;
    if ((currentSet) == 11) {
        return ;
    }
    question.setText(questions[currentSet]);
    answerA.setText(("A) " + (answersA[currentSet])));
    answerB.setText(("B) " + (answersB[currentSet])));
    answerC.setText(("C) " + (answersC[currentSet])));
}