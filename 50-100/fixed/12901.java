@java.lang.Override
public void onBarDelete(int total) {
    score += total;
    callback.onScoreChange(score);
    if ((score) >= ((level) * (home.tetris.Scene.SCORE_PER_LEVEL))) {
        (level)++;
        sound.play(Sound.LEVEL_UP);
        callback.onLevelUp(level);
    }
    deletingAnimation.falling(total);
}