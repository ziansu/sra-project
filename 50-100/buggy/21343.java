public void solve() {
    int n = in.ni();
    int m = in.ni();
    if (n >= m) {
        out.println((n - m));
    }else {
        int rem = m % n;
        out.println((n - rem));
    }
}