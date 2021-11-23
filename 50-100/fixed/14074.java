public synchronized java.util.List<java.lang.String> getMostFrequent() {
    norbert.wikigram.counter.NgramsByFrequency nbf = new norbert.wikigram.counter.NgramsByFrequency();
    for (java.util.Map.Entry<java.lang.String, java.lang.Long> numberOfTuples : numberOfNgrams.entrySet()) {
        nbf.update(numberOfTuples.getKey(), numberOfTuples.getValue());
    }
    return nbf.getMostFrequentNgrams();
}