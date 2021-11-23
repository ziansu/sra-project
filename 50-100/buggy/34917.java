private void displayFortune() {
    java.lang.String input = null;
    try {
        input = mQuestion.getText().toString().replaceAll("\\s+", "");
    } catch (java.lang.Exception e) {
        mAnswer.setText("You did not enter any input.");
    }
    if (input.equals("")) {
        mAnswer.setText("You did not ask a question.");
    }else {
        java.lang.String fortune = mFortune.getFortune();
        mAnswer.setText(fortune);
    }
}