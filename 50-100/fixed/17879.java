@java.lang.Override
public boolean onTouch(android.view.View v, android.view.MotionEvent event) {
    if (((event.getAction()) == (android.view.MotionEvent.ACTION_DOWN)) || ((event.getAction()) == (android.view.MotionEvent.ACTION_POINTER_DOWN))) {
        if (this.game_over) {
            this.startGame();
        }else {
        }
        return true;
    }
    return false;
}