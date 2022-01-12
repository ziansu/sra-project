public void checkQuestion6() {
    java.lang.String question6Answer = question6EditText.getText().toString();
    question6Answer = question6Answer.toUpperCase();
    if ((question6Answer.equals("SINGLE LENS REFLEX")) || (question6Answer.equals("SINGLE-LENS REFLEX"))) {
        editTextAnswers[1] = 1;
    }
}