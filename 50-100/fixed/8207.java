public void onSwipeBottom() {
    if ((contains(LevelArrays.MOVE_UP, currentLevel[y][x])) && (allowInput)) {
        (y)--;
        move();
        startAnimation(0, 0, 0, ((com.ollum.mazecape.Level.width) / 3));
        vibrator.vibrate(VIBRATE_SHORT);
    }else {
        vibrator.vibrate(VIBRATE_MEDIUM);
    }
}