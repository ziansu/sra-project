private int getRandomNumber(java.util.List<java.lang.Integer> foundTheNumberOf) {
    int randomNumber = random.nextInt(100);
    if (foundTheNumberOf.contains(randomNumber))
        getRandomNumber(foundTheNumberOf);
    
    return randomNumber;
}