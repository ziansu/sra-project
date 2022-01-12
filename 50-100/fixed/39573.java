@java.lang.Override
public void onTick(long milisUntilFinished) {
    timer.setText(((((milisUntilFinished / 1000) + " ") + (teamNamesStr[teamPlaying])) + " PLAYS"));
    if ((milisUntilFinished / 1000) <= 10) {
        timer.setTextColor(Color.RED);
    }
    currentTime = ((int) (milisUntilFinished / 1000));
}