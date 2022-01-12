private boolean declare() {
    if (USER1_TURN)
        LOCK1 = true;
    else
        LOCK2 = true;
    
    return (LOCK1) && (LOCK2);
}