public java.lang.String joker(int positionRightAnswer) {
    int wrongQuestion = ((int) ((java.lang.Math.random()) * (((wrongAnswers.size()) - 1) + 1)));
    while (wrongQuestion == positionRightAnswer) {
        wrongQuestion = ((int) ((java.lang.Math.random()) * ((wrongAnswers.size()) + 1)));
    } 
    return wrongAnswers.get(wrongQuestion);
}