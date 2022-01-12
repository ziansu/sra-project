public void setScoreChoices() {
    java.util.List<java.lang.String> list = new java.util.ArrayList<>();
    for (int i = minScore; i <= (maxScore); i++) {
        if (i != 0) {
            list.add(java.lang.String.valueOf(i));
        }
    }
    this.scoreChoices = list;
}