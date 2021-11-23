public void move(int x, int y) {
    if ((isSnapped) || (isMaximized))
        return ;
    
    for (java.lang.String activityClass : activitiesStack.keySet()) {
        move(x, y, activityClass);
    }
    defaultLayout.position(x, y);
}