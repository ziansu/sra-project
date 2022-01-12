@java.lang.Override
protected void onResume() {
    super.onResume();
    initMusic();
    if (!(model.isGameOver()))
        initTimer();
    
}