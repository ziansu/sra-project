@java.lang.Override
public void onWindowFocusChanged(boolean hasFocus) {
    super.onWindowFocusChanged(hasFocus);
    if (hasFocus) {
        setTitle(selectedClub);
        if (!(de.schneider_simon.minigolfscores.PlayRound.isPutViewsDone)) {
            playRoundViews.putViewsIntoGridlayout();
            playRoundViews.writeContentToViews(playRoundContent);
            de.schneider_simon.minigolfscores.PlayRound.isPutViewsDone = true;
        }
    }
}