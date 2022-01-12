@java.lang.Override
public r48.RubyIO targetToBound(r48.RubyIO target) {
    long t = target.fixnumVal;
    long type = 0;
    if (t > 10000) {
        t -= 10000;
        type++;
    }
    r48.RubyIO base = new r48.RubyIO();
    base.arrVal = new r48.RubyIO[2];
    base.type = '[';
    base.arrVal[0] = new r48.RubyIO().setFX(type);
    base.arrVal[1] = new r48.RubyIO().setFX(t);
    return base;
}