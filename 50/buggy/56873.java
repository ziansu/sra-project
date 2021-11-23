public void setStepSize(double h) {
    this.n = ((int) (java.lang.Math.round(java.lang.Math.abs((((tend) - (t0)) / h))))) + 1;
    setStepSize();
    computeExacty();
}