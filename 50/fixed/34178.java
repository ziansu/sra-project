public Mem mitosis() {
    this.size = 2;
    return new Mem((this.address += (this.size) / 2), true, this.size, (-1), 2);
}