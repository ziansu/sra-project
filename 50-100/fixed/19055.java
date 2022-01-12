public void start() {
    chooseDifficulty();
    guessNumber = com.netcracker.edu.ssu.dobrynin.artemiy.task002.generator.Generator.getRandomNumber(origin, bound);
    points = ((bound) - (origin)) * 100;
    guesser();
    if (!(quitFlag))
        cycleStart();
    
}