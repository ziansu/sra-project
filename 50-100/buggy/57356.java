public double laplaceEstimate(java.lang.String sequence) {
    java.lang.String context = sequence.substring(0, ((sequence.length()) - 1));
    double npc = n1gram.getNgramFrequency(sequence);
    double np = ngram.getNgramFrequency(context);
    double laplace;
    laplace = (npc + 1) / (np + (ngram.getAlphabetSize()));
    return laplace;
}