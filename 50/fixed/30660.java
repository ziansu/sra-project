private void checkQuestionTwoAnswers() {
    android.widget.RadioButton radioButtonBruce = ((android.widget.RadioButton) (findViewById(R.id.radio_bruce)));
    boolean isRadioButtonBruceChecked = radioButtonBruce.isChecked();
    if (isRadioButtonBruceChecked) {
        correctAnswers += 1;
    }else {
        correctAnswers += 0;
    }
}