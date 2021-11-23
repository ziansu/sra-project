public void solve() {
    int n = in.ni();
    int m = in.ni();
    if (n >= m) {
        out.println((n - m));
    }else {
        int rem = m % n;
        if (rem != 0) {
            out.println((n - rem));
        }else {
            out.println(0);
        }
    }
}