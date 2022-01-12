public void clear() {
    HangulBuffer.clear();
    rawChar.clear();
    Syllables.clear();
    wordValid = 1;
    clearComp();
}