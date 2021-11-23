private long assignIdBasedOnOriginalSplit(long originalId) {
    long gen = 1L << ((net.osmand.data.preparation.IndexVectorMapCreator.SHIFT_NON_EXISTING_IDS) - 1);
    gen += originalId;
    while (generatedIds.contains(gen)) {
        gen++;
    } 
    generatedIds.add(gen);
    return gen;
}