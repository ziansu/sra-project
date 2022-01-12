public void setPattern(com.zappyware.learnletters.ui.LetterView.DisplayMode displayMode, java.util.List<com.zappyware.learnletters.entities.Point> points) {
    mPoints.clear();
    mPoints.addAll(points);
    clearPatternDrawLookup();
    com.zappyware.learnletters.ui.LetterView.CellState state = null;
    for (com.zappyware.learnletters.entities.Point point : points) {
        state = new com.zappyware.learnletters.ui.LetterView.CellState();
        state.size = mDotSize;
        mPointStates.put(point, state);
        mPatternDrawLookup.put(point, java.lang.Boolean.TRUE);
    }
    setDisplayMode(displayMode);
}