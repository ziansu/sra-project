public int getNextFreeFPID() {
    int i = 1;
    while (containsFP(i)) {
        i++;
    } 
    return i;
}