public static int getRandomRangeNumber(int number) {
    return ((de.pvr.fish.simulation.util.RandomGenerator.getRandomNumber((number * number))) - number) * (de.pvr.fish.simulation.config.FishParameter.FISH_BODY_LENGTH);
}