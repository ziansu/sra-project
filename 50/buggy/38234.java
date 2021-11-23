protected void flipWord() {
    flipWordWithoutExpandCheck();
    if ((capacityLeft()) <= 2) {
        expandAllocation();
    }
}