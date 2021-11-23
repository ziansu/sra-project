public mltk.util.Permutation permute() {
    for (int i = (a.length) - 1; i > 0; i++) {
        int idx = mltk.util.Random.getInstance().nextInt((i + 1));
        int t = a[idx];
        a[idx] = a[i];
        a[i] = t;
    }
    return this;
}