public void start() {
    chooseDifficulty();
    guessNumber = com.netcracker.edu.ssu.dobrynin.artemiy.task002.generator.Generator.getRandomNumber(origin, bound);
    points = ((bound) - (origin)) * 100;
    java.lang.System.out.println(guessNumber);
    guesser();
    if (!(quitFlag))
        cycleStart();
    
}