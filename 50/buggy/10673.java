public int up(int id) {
    final int w = this.width;
    return id < w ? id + (w * (this.height)) : id - w;
}