public static me.moodcat.database.embeddables.VAVector createRandomVector() {
    final java.util.Random random = new java.util.Random();
    final double valence = (2 * (random.nextDouble())) - 1.0;
    final double arousal = (2 * (random.nextDouble())) - 1.0;
    return new me.moodcat.database.embeddables.VAVector(valence, arousal);
}