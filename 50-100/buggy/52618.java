public void Add(int val) {
    int k = 32 - (this.b);
    int r = rho((val << (this.b)), k);
    int j = val >> k;
    if (r > (this.registers[j])) {
        this.registers[j] = r;
    }
}