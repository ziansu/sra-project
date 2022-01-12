private int matchKeywordScore(quicklyst.Task currTask, java.lang.String keyword) {
    java.lang.String[] taskNameWords = currTask.getName().split(" ");
    int totalScore = 0;
    for (java.lang.String currWord : taskNameWords) {
        currWord = currWord.trim();
        if (currWord.contains(keyword)) {
            totalScore++;
        }
        if (currWord.equals(keyword)) {
            totalScore++;
        }
    }
    return totalScore;
}