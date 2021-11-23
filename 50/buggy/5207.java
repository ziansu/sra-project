@java.lang.Override
protected void onResume() {
    super.onResume();
    if (model.isGameOver())
        return ;
    
    initTimer();
    initMusic();
}