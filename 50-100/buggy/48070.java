public void set_t0(double t0) throws java.lang.IllegalArgumentException {
    if (t0 < (tend)) {
        this.t0 = t0;
        computeExacty();
        setStepSize();
    }else {
        throw new java.lang.IllegalArgumentException(((("The value of t0=" + t0) + " should be less than tend=") + (tend)));
    }
}