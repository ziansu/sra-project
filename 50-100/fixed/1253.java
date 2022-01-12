private void BEQ(int arg) {
    if (this.isZeroFlag()) {
        int oldPc = this.programCounter;
        this.programCounter += arg;
        if (this.isNewPage((oldPc + 1), ((this.programCounter) + 1))) {
            this.cycles += 2;
        }else {
            (this.cycles)++;
        }
    }
}