public int getRandomNumber(int n) {
    int max = (n / 4) * 3;
    int min = n / 2;
    java.util.Random ra = new java.util.Random();
    if (max == 0)
        return 0;
    
    int choice = (ra.nextInt((max - min))) + min;
    return choice;
}