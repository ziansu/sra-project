private boolean[] checkRadioGroupCorrectAnswers() {
    boolean[] RGCorrectAnswers = new boolean[radioGroupAnswerGroups.size()];
    for (int i = 0; i < (radioGroupAnswerGroups.size()); i += 1) {
        RGCorrectAnswers[i] = (radioGroupAnswerGroups.get(i).getCheckedRadioButtonId()) == (radioGroupCorrectAnswers.get(i).getId());
    }
    return RGCorrectAnswers;
}