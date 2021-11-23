public void checkQuestion6() {
    android.widget.EditText question6EditText = ((android.widget.EditText) (findViewById(R.id.question_6_Edit_Text)));
    java.lang.String question6Answer = question6EditText.getText().toString();
    question6Answer = question6Answer.toUpperCase();
    if ((question6Answer.equals("SINGLE LENS REFLEX")) || (question6Answer.equals("SINGLE-LENS REFLEX"))) {
        editTextAnswers[1] = 1;
    }
}