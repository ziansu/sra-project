protected void setExtr() {
    this.umax = new org.la4j.vector.dense.BasicVector(data).max();
    this.umin = new org.la4j.vector.dense.BasicVector(data).min();
}