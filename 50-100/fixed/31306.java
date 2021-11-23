public void Add(long val) {
    int k = 32 - (this.b);
    int r = rho((val << (this.b)), k);
    int j = ((int) (val >> (java.lang.Math.abs(k))));
    if (r > (this.registers[j])) {
        this.registers[j] = r;
    }
}