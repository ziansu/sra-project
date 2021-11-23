private void nextWord() {
    if (gameOn) {
        if ((startTime) <= (java.lang.System.currentTimeMillis())) {
            if (!(gameWords.isEmpty())) {
                word.setText(gameWords.pop());
            }else {
                android.widget.Toast toast = new android.widget.Toast(this);
                toast.makeText(this, "No more words GAME OVER!", Toast.LENGTH_LONG);
            }
        }else {
            endRound();
        }
    }
}