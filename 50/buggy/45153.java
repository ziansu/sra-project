public void set_n(int n) {
    set_t0(t0);
    set_tend(tend);
    this.n = n;
    setStepSize();
    computeExacty();
}