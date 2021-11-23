public void reduceRemainingTime() {
    if ((runwayTimeLeft) > 0)
        --(runwayTimeLeft);
    
    if ((runwayTimeLeft) <= 0)
        operation = 'I';
    
}