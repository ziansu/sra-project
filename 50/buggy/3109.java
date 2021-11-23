public void increaseSetResults() {
    (numSetResults)++;
    if ((numSetResults) == (max)) {
        notify();
    }
}