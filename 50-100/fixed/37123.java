private static double calcTf(processor.BowDocument doc, java.lang.String term) {
    double termFrequency = 0.0;
    if (doc.containsTerm(term))
        termFrequency = doc.getTermCount(term);
    
    if (termFrequency == 0.0)
        return termFrequency;
    
    return 1 + (java.lang.Math.log10(termFrequency));
}