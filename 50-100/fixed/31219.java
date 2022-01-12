private boolean[] checkCheckBoxCorrectAnswers() {
    boolean[] CBCorrectAnswers = new boolean[question3CheckBoxAnswers.size()];
    for (int i = 0; i < (question3CheckBoxAnswers.size()); i += 1) {
        CBCorrectAnswers[i] = (question3CheckBoxAnswers.get(i).isChecked()) == (question3CorrectCheckBoxAnswers.get(i));
    }
    return CBCorrectAnswers;
}