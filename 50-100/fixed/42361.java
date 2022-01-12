public void move(int x, int y) {
    if ((isSnapped) || (isMaximized))
        return ;
    
    for (java.lang.Integer activityClass : activitiesStack.keySet()) {
        move(x, y, activityClass);
    }
    defaultLayout.position(x, y);
}