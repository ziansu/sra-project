public com.hourglassapps.cpi_ii.report.QueryPhrases.Answers startAnswering(int pNumAnswers, com.hourglassapps.cpi_ii.report.Accumulator<java.lang.Integer> pDocIdHarvester) {
    if ((mAnswers) != null) {
        throw new java.lang.IllegalStateException("Answers already initialised");
    }
    mAnswers = new com.hourglassapps.cpi_ii.report.QueryPhrases.Answers(pNumAnswers, pDocIdHarvester);
    return mAnswers;
}