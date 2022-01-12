public java.lang.String createNext() {
    while (previousAnswers.contains(exerciseResult)) {
        this.create();
    } 
    if ((previousAnswers.size()) >= (getFahkinBitchExerciseResetValue())) {
        previousAnswers.clear();
    }
    return exerciseString;
}