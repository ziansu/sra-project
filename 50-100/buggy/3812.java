private sadl.input.TimedInput sample(int numSeq, sadl.constants.ClassLabel label, sadl.models.pdrta.PDRTA... a) {
    final java.util.List<sadl.input.TimedWord> seqs = new java.util.ArrayList<>(numSeq);
    int roundRobin = 0;
    for (int i = 0; i < numSeq; i++) {
        seqs.add(sampleSeq(a[roundRobin], label));
        roundRobin %= a.length;
    }
    return new sadl.input.TimedInput(seqs);
}