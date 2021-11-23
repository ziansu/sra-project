protected com.freedomotic.reactions.Command findMostSimilarCommand(java.lang.String phrase) throws com.freedomotic.exceptions.NoResultsException {
    java.util.List<com.freedomotic.nlp.Nlp.Rank<com.freedomotic.reactions.Command>> ranking = nlpCommands.computeSimilarity(phrase, 10);
    if ((ranking.isEmpty()) || ((ranking.get(0).getSimilarity()) <= 0)) {
        throw new com.freedomotic.exceptions.NoResultsException((("No command is similar enough to '" + phrase) + "'"));
    }
    return ranking.get(0).getElement();
}