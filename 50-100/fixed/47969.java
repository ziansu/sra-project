protected int findEmptySpotInString() {
    int i = getRandomNumber(0, passLength);
    for (int j = i; j < ((passLength) + i); j++) {
        if (j == (passLength))
            j = 0;
        
        if ((passwordArray[j]) == ' ')
            return j;
        
    }
    java.lang.System.out.println("NEVER");
    return -1;
}