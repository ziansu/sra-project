public long getLovecaAmount() {
    long lovecaAmount = (getLpShortage()) / (getBiggestLP());
    lovecaAmount = (((getLpShortage()) % (getBiggestLP())) <= 0) ? lovecaAmount : lovecaAmount + 1;
    return lovecaAmount < 0 ? 0 : lovecaAmount;
}