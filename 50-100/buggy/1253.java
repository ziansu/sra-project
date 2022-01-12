private void BEQ(int arg) {
    if (this.isZeroFlag()) {
        int oldPc = this.programCounter;
        this.programCounter += arg;
        if (this.isNewPage(oldPc, this.programCounter)) {
            this.cycles += 2;
        }else {
            (this.cycles)++;
        }
    }
}