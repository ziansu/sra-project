public void incrementNumber() {
    this.number += 1;
    if ((this.number) > (this.MAX_POSSIBLE)) {
        this.number = this.MIN_POSSIBLE;
    }
}