public void add(int n, int a) {
    if ((stack.size()) <= n) {
        stack.add(n, a);
    }else {
        stack.set(n, a);
    }
}