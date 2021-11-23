protected void setExtr() {
    this.umax = new org.la4j.vector.dense.BasicVector(this.data).max();
    this.umin = new org.la4j.vector.dense.BasicVector(this.data).min();
}