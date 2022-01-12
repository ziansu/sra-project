protected void checkAnswer(java.lang.String answer, boolean outOfTime) {
    if (answer.equals(members[memberNum])) {
        score += 1;
        refreshScoreText();
    }else {
        java.lang.String wrongText;
        if (!outOfTime) {
            wrongText = "You suck! The correct answer was " + (members[memberNum]);
        }else {
            wrongText = "You ran out of time! The correct answer was " + (members[memberNum]);
        }
        android.widget.Toast toast = android.widget.Toast.makeText(getApplicationContext(), wrongText, Toast.LENGTH_SHORT);
        toast.show();
    }
}