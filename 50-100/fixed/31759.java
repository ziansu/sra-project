public void rankSplit(java.lang.String rankArray) {
    java.lang.String[] stringCutter;
    java.lang.String score;
    java.lang.String title;
    stringCutter = rankArray.split(",");
    for (int i = 0; i < (stringCutter.length); i += 2) {
        score = stringCutter[i];
        title = stringCutter[(i + 1)];
        ranksValue.add(score);
        ranksTitle.add(title);
    }
}