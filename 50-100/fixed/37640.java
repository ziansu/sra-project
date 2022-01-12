public void onSwipeRight() {
    if ((contains(LevelArrays.MOVE_LEFT, currentLevel[y][x])) && (allowInput)) {
        (x)--;
        move();
        startAnimation(0, ((com.ollum.mazecape.Level.width) / 3), 0, 0);
        vibrator.vibrate(VIBRATE_SHORT);
    }else {
        vibrator.vibrate(VIBRATE_MEDIUM);
    }
}