private int findEmptySpotInString() {
    int a = getRandomNumber(0, passLength);
    for (int j = a; j < ((passLength) + a); j++) {
        if (j == (passLength))
            j = 0;
        
        if ((passwordArray[j]) == ' ')
            return j;
        
    }
    java.lang.System.out.println("NEVER");
    return -1;
}