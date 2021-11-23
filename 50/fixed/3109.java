private void increaseSetResults() {
    (numSetResults)++;
    if ((numSetResults) == (max)) {
        notify();
    }
}