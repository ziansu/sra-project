@java.lang.Override
public void onBarDelete(int total) {
    score += total;
    callback.onScoreChange(score);
    if (((score) % (home.tetris.Scene.SCORE_PER_LEVEL)) == 0) {
        (level)++;
        sound.play(Sound.LEVEL_UP);
        callback.onLevelUp(level);
    }
    deletingAnimation.falling(total);
}