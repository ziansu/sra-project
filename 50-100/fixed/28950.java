public void replaceSol2(int[] a) {
    for (int i = (a.length) - 1; i >= 0; i--) {
        succ = null;
        root = insert(root, a[i]);
        a[i] = ((succ) == null) ? -1 : succ.data;
    }
}