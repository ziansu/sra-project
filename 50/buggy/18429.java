private boolean isQuestionFilled() {
    return (!(mQuestionEditText.getText().toString().equals(""))) || (!(mQuestionEditText.getText().toString().equals(" ")));
}