private void displayFortune() {
    java.lang.String input = null;
    try {
        input = mQuestion.getText().toString().replaceAll("\\s+", "");
    } catch (java.lang.Exception e) {
        mAnswer.setText("You did not enter any input.");
    }
    java.lang.String f = mFortune.getFortune();
    mAnswer.setText(f);
}