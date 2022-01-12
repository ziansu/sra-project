public java.lang.String createNext() {
    do {
        this.create();
    } while (previousAnswers.contains(exerciseResult) );
    if ((previousAnswers.size()) >= (getFahkinBitchExerciseResetValue())) {
        previousAnswers.clear();
    }
    return exerciseString;
}