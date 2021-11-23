public com.hourglassapps.cpi_ii.report.QueryPhrases.Answers startAnswering(int pNumAnswers, com.hourglassapps.cpi_ii.report.Accumulator<java.lang.Integer> pDocIdHarvester) {
    if ((mAnswers) != null) {
        return null;
    }
    mAnswers = new com.hourglassapps.cpi_ii.report.QueryPhrases.Answers(pNumAnswers, pDocIdHarvester);
    return mAnswers;
}