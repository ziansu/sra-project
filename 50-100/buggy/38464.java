private int getAccIndexMAF(java.lang.String targetAccNum) {
    java.lang.String accNum;
    int counter = 0;
    for (java.lang.String line : masterAccountsList) {
        accNum = line.substring(0, 8);
        if (accNum.equals(targetAccNum))
            return counter;
        
    }
    return -1;
}