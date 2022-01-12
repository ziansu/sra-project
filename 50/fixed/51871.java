public void onRestart() {
    createLevel();
    resetGraphycs();
    menuButton.unpress();
    MainActivity.GAME_PHASE = MainActivity.Phase.REDACTOR;
    com.zheleproduction.zhelesnake.Redactor.dialogIsClosed = true;
}