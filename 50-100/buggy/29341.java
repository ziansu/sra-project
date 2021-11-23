public int extract(java.lang.String line, java.util.List<cc.redpen.util.Pair<java.lang.Integer, java.lang.Integer>> sentencePositions) {
    int startPosition = 0;
    int periodPosition = endOfSentenceDetector.getSentenceEndPosition(line);
    while (periodPosition >= 0) {
        sentencePositions.add(new cc.redpen.util.Pair(startPosition, (periodPosition + 1)));
        startPosition = periodPosition + 1;
        periodPosition = endOfSentenceDetector.getSentenceEndPosition(line, startPosition);
    } 
    return startPosition;
}