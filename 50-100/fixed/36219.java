public void onFinish() {
    timerTextView.setText("done!");
    for (int i = 1; i <= 9; i++) {
        int resId = getResources().getIdentifier(("b" + i), "id", getPackageName());
        android.widget.Button b = ((android.widget.Button) (findViewById(resId)));
        b.setClickable(false);
    }
    gameStatus = com.diana.squares.MainActivity.GAME_IS_FINISHED;
    showFinalMessage();
}