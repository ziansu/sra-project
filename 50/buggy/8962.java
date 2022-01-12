public boolean checkCopyOut(Copy c) {
    c.setOutTo(this);
    this.copiesOut.add(c);
    return false;
}