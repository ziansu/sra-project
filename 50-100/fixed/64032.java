private void solve() {
    int tn = in.nextInt();
    in.nextLine();
    for (int test = 1; test <= tn; test++) {
        int n = in.nextInt();
        in.nextLine();
        java.lang.String sequence = in.nextLine();
        int ans = calculate(n, sequence);
        out.println(((("Case #" + test) + ": ") + ans));
    }
}