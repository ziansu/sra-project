private int generateNewRandom(int min, int max, int previousRandom) {
    int range = (max - min) + 1;
    int newRandom = ((int) ((java.lang.Math.random()) * range));
    if (newRandom != previousRandom)
        return newRandom;
    else {
        while (newRandom == previousRandom) {
            newRandom = ((int) ((java.lang.Math.random()) * range));
        } 
        return newRandom;
    }
}