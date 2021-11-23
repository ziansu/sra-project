@java.lang.Override
protected void newQuestion() {
    if ((currentPos) >= (answerSet.size())) {
        java.util.Collections.shuffle(answerIndices);
        resetCurrentPos();
    }
    super.newQuestion();
}