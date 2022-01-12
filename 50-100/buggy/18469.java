public static void randomShuffle(de.lmu.ifi.dbs.elki.database.ids.ArrayModifiableDBIDs ids, java.util.Random random, final int limit) {
    for (int i = 1; i < limit; i++) {
        ids.swap((i - 1), (i + (random.nextInt((limit - i)))));
    }
}