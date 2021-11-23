private boolean[] checkRadioGroupCorrectAnswers() {
    boolean[] RGCorrectAnswers = new boolean[radioGroupAnswerGroups.length];
    for (int i = 0; i < (radioGroupAnswerGroups.length); i += 1) {
        RGCorrectAnswers[i] = (radioGroupAnswerGroups[i].getCheckedRadioButtonId()) == (radioGroupCorrectAnswers[i].getId());
    }
    return RGCorrectAnswers;
}