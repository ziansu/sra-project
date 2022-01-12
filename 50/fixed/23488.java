private int getRandomNumber(java.util.List<java.lang.Integer> foundTheNumberOf) {
    while (true) {
        int randomNumber = random.nextInt(100);
        if (!(foundTheNumberOf.contains(randomNumber)))
            return randomNumber;
        
    } 
}