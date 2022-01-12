private boolean[] checkCheckBoxCorrectAnswers() {
    boolean[] CBCorrectAnswers = new boolean[question3CheckBoxAnswers.length];
    for (int i = 0; i < (question3CheckBoxAnswers.length); i += 1) {
        CBCorrectAnswers[i] = (question3CheckBoxAnswers[i].isChecked()) == (question3CorrectCheckBoxAnswers[i]);
    }
    return CBCorrectAnswers;
}