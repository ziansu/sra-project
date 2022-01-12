public void update(java.lang.String ngram, java.lang.Integer frequency) {
    if ((sortedNgrams.first().getFrequency()) < frequency) {
        norbert.wikigram.counter.NgramsByFrequency.NgramAndFrequency newFrequencyNgram = new norbert.wikigram.counter.NgramsByFrequency.NgramAndFrequency(ngram, frequency);
        sortedNgrams.remove(newFrequencyNgram);
        sortedNgrams.add(newFrequencyNgram);
        if ((maximumNgrams) == (sortedNgrams.size())) {
            sortedNgrams.pollFirst();
        }
    }
}