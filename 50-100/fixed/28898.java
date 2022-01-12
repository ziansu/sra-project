public void onSwipeLeft() {
    if ((contains(LevelArrays.MOVE_RIGHT, currentLevel[y][x])) && (allowInput)) {
        (x)++;
        move();
        startAnimation(0, ((-(com.ollum.mazecape.Level.width)) / 3), 0, 0);
        vibrator.vibrate(VIBRATE_SHORT);
    }else {
        vibrator.vibrate(VIBRATE_MEDIUM);
    }
}