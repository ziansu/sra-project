public double getConditionalProd(java.lang.String term1, java.lang.String term2) {
    double unigramScore = unigramProbForTerm(term2);
    if (term1 == null) {
        return unigramScore * 2;
    }
    double termUnigram = rawCountForTerm(term1);
    double countBigram = rawBiCountForTerms(term1, term2);
    double bigramScore = (java.lang.Math.log(countBigram)) - (java.lang.Math.log((termUnigram + (Config.eps))));
    return (unigramScore * (Config.smoothingFactor)) + (bigramScore * (1 - (Config.smoothingFactor)));
}