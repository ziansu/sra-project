private void validateAnswer(android.view.View view) {
    answerContainer.setVisibility(View.VISIBLE);
    android.widget.RadioButton radio = ((android.widget.RadioButton) (group.findViewById(group.getCheckedRadioButtonId())));
    if (radio.getText().toString().equals(correctAnswer.getText().toString())) {
        answerStatus.setImageResource(R.drawable.ic_check_ok);
    }else {
        answerStatus.setImageResource(R.drawable.ic_check_nok);
    }
}