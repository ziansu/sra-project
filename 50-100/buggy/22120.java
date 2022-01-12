public static me.moodcat.database.embeddables.VAVector createRandomVector() {
    java.util.Random random = new java.util.Random();
    double valence = (2 * (random.nextDouble())) - 1.0;
    double arousal = (2 * (random.nextDouble())) - 1.0;
    return new me.moodcat.database.embeddables.VAVector(valence, arousal);
}