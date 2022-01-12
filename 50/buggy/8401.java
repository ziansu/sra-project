private int getDevCardCount() {
    int total = 0;
    for (int i = 0; i < (this.numberDevCardTypes); i++) {
        total += this.devCards[i];
    }
    return total;
}