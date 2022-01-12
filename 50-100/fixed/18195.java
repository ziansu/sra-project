@java.lang.Override
public void onClick(android.view.View v) {
    int difficulty = getDifficulty();
    if (((numberOfRightAnswers) >= ((int) (3 * 0.75))) && (position == difficulty)) {
        difficulty++;
        setDifficulty(difficulty);
    }else
        if (((numberOfRightAnswers) < ((int) (3 * 0.75))) && (position == difficulty)) {
            setDifficulty(difficulty);
        }
    
    setContentView(R.layout.activity_singleplayer_leveloverview);
    setupLevelOverview();
}