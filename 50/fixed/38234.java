protected void flipWord() {
    if ((capacityLeft()) <= 2) {
        expandAllocation();
    }
    flipWordWithoutExpandCheck();
}