public int down(int id) {
    final int w = this.width;
    return id >= (w * ((this.height) - 1)) ? id % w : id + w;
}