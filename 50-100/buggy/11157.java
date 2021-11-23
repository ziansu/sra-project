public java.lang.Object pre(int t) {
    if (t == 0) {
        return ref;
    }
    t = t - 1;
    checkNonEmptyStream("pre");
    checkCapacity(t);
    if (t >= (size)) {
        return bonsai.runtime.core.Cast.toLattice(name, ref).bottom();
    }else {
        return stream[preIndex(t)];
    }
}