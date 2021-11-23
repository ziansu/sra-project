public boolean outOfRange() {
    if ((guess) > (maxItemsInJar)) {
        java.lang.System.out.printf("Your guess must be less than maximum fill amount %s", maxItemsInJar);
        return true;
    }else
        if ((guess) < 1) {
            java.lang.System.out.println("Your guess must be greater than 1");
            return true;
        }else {
            (numberOfGuesses)++;
        }
    
    return false;
}