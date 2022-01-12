private boolean displacementAdheresToSwipeChecks(float dx, boolean leftSwipeDisable, boolean rightSwipeDisable) {
    if (leftSwipeDisable)
        return dx >= 0;
    else
        return (!rightSwipeDisable) || (dx <= 0);
    
}