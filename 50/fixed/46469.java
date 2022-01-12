public int down(int id) {
    final int w = this.width;
    return (id + w) % (w * (this.height));
}