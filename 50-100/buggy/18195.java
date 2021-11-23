@java.lang.Override
public void onClick(android.view.View v) {
    if ((numberOfRightAnswers) >= ((int) (3 * 0.75))) {
        int difficulty = (getDifficulty()) + 1;
        setDifficulty(difficulty);
    }else {
        int difficulty = getDifficulty();
        setDifficulty(difficulty);
    }
    setContentView(R.layout.activity_singleplayer_leveloverview);
    setupLevelOverview();
}