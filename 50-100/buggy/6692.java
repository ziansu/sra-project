public int advance(int target) throws java.io.IOException {
    int doc = scorer.advance(target);
    if (doc == (NO_MORE_DOCS)) {
        return doc;
    }
    currentScore = innerScore();
    if ((currentScore) < (minScore)) {
        return scorer.nextDoc();
    }
    return doc;
}