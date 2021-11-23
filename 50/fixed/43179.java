public void move(com.snakev2v42.tiny.snakev2.Vector vec) {
    p.plus(this.vec);
    oldVec = this.vec;
    this.vec = vec;
}