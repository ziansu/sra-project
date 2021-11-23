protected void redraw() {
    scoreDisplay.setText(((main.StatsDisplay.SCORE_PREFIX) + (score)));
    timeDisplay.setText(((main.StatsDisplay.TIME_PREFIX) + (main.Util.millisToTime(time))));
}