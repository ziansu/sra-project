public int getIncorrectAns() {
    do {
        incorrectAnswer = generateIncorrectAns();
    } while (hasSameValueInBaffaAs(incorrectAnswer) );
    pushToBaffa(incorrectAnswer);
    return incorrectAnswer;
}