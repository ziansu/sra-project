public java.lang.Object pop() {
    final int n = stack.size();
    if (n == 0) {
        throw new java.lang.RuntimeException("The stack is empty");
    }
    for (int i = (marks.size()) - 1; i >= 0; --i) {
        if ((marks.get(i)) == n) {
            marks.set(i, (n - 1));
        }
    }
    return stack.remove((n - 1));
}