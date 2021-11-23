public void setWordLength(pl.edu.zut.Calculator.WordLength wordLength) {
    this.wordLength = wordLength;
    this.reg1 &= getCurrentMask();
    this.reg2 &= getCurrentMask();
}