public static void randomShuffle(de.lmu.ifi.dbs.elki.database.ids.ArrayModifiableDBIDs ids, java.util.Random random, final int limit) {
    final int end = ids.size();
    for (int i = 1; i < limit; i++) {
        ids.swap((i - 1), (i + (random.nextInt((end - i)))));
    }
}