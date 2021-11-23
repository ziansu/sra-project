private void declare() {
    if (USER1_TURN)
        LOCK1 = true;
    else
        LOCK2 = true;
    
    if ((LOCK1) && (LOCK2))
        endGame();
    
}