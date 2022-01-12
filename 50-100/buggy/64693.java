public int getRandomNumber(int n) {
    int max = (n / 4) * 3;
    int min = n / 2;
    java.util.Random ra = new java.util.Random();
    int choice = (ra.nextInt((max - min))) + min;
    return choice;
}