public int getConfusionCount(java.lang.String error, java.lang.String correct) {
    java.lang.Integer count = confusionMatrix.get(((error + "|") + correct));
    return count == null ? 0 : count;
}