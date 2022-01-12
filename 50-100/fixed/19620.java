public void solve() {
    this.clear();
    for (int r = 0; r < (((rows) / 2) + 1); r++) {
        for (int c = 0; c < (((cols) / 2) + 1); c++) {
            boolean didItWork = solveHelper(r, c, 1);
            if (didItWork)
                return ;
            
            this.clear();
        }
    }
}