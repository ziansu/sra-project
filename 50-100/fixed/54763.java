public long getLovecaAmount() {
    if ((getBiggestLP()) == 0) {
        return 0;
    }
    long lovecaAmount = (getLpShortage()) / (getBiggestLP());
    lovecaAmount = (((getLpShortage()) % (getBiggestLP())) <= 0) ? lovecaAmount : lovecaAmount + 1;
    return lovecaAmount < 0 ? 0 : lovecaAmount;
}