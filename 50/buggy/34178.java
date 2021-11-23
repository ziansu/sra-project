public Mem mitosis() {
    return new Mem((this.address += (this.size) / 2), true, this.size, (-1));
}