@java.lang.Override
public void run() {
    if ((moveCount) == 0)
        return ;
    
    (timeInSeconds)++;
    activity.updateTime(timeInSeconds);
    if (gameInProgress)
        postHandler.postDelayed(this, 1000);
    
}