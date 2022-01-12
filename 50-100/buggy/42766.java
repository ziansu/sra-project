private static void add(@javax.annotation.Nonnull
final java.util.List<hivemall.utils.lang.mutable.MutableDouble> src, @javax.annotation.Nonnull
final java.util.List<hivemall.utils.lang.mutable.MutableDouble> dst) {
    for (int i = 0, size = src.size(); i < size; i++) {
        hivemall.utils.lang.mutable.MutableDouble s = src.get(i);
        assert s != null;
        hivemall.utils.lang.mutable.MutableDouble d = dst.get(i);
        assert d != null;
        d.addValue(s.getValue());
    }
}