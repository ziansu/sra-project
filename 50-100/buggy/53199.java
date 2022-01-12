public void calcValues(HugePrime p, HugePrime q) {
    this.p = p;
    this.q = q;
    XMLWriter xw = new XMLWriter();
    n = p.multiply(q);
    HugeUnsignedInt p1 = p.subtract(1);
    HugeUnsignedInt q1 = q.subtract(1);
    l = p1.multiply(q1);
    e = new HugeUnsignedInt(7);
    HugeUnsignedInt k = new HugeUnsignedInt("351812273291173183");
    d = k;
}