private void verifyPath(java.lang.String startValue, java.lang.String endValue, java.lang.String[] wordSet, java.util.List<java.lang.String> expectedPath) {
    mDictionary.setWords(wordSet);
    mEvaluator.setTarget(endValue);
    org.marshallramsey.shortestpath.PathFinder<java.lang.String> pathFinder = new org.marshallramsey.shortestpath.PathFinder<java.lang.String>(mPathProvider, mChildCreator);
    assertEquals(expectedPath, pathFinder.getShortestPath(startValue, endValue));
}