public void solve2() {
    this.clear();
    for (int r = 0; r <= ((rows) / 2); r++) {
        for (int c = 0; c <= ((rows) / 2); c++) {
            boolean didItWork = solveBetter(r, c, 1);
            if (didItWork)
                return ;
            
            this.clear();
        }
    }
}