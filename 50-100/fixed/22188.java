private static boolean isAllFalse(boolean[] bool) {
    boolean allFalse = false;
    int falseNumber = 0;
    for (int i = 0; i < (bool.length); i++) {
        if ((bool[i]) == false)
            falseNumber++;
        
    }
    if (falseNumber == (bool.length))
        allFalse = true;
    
    return allFalse;
}