public void gameClick(android.view.View v) {
    if ((!(canClick)) && (((android.os.SystemClock.elapsedRealtime()) - (lastClickTime)) < 200))
        return ;
    
    canClick = false;
    lastClickTime = android.os.SystemClock.elapsedRealtime();
    super.gameClick(v);
    this.playerHandle(v);
}