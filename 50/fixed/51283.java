@java.lang.Override
public void run() {
    if ((moveCount) == 0)
        return ;
    
    (timeInSeconds)++;
    activity.updateTime();
    if (gameInProgress)
        postHandler.postDelayed(this, 1000);
    
}