public boolean isFinalCPUBurst() {
    if (((positionCounter) + 1) >= (totalBurst()))
        return true;
    else
        return false;
    
}