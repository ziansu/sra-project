public boolean getInRange(int roll) {
    if (((roll + 1) >= (low)) && ((roll + 1) <= (high)))
        return true;
    
    return false;
}