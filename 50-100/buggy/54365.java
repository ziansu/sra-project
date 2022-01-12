public void ensurePool(int howmany) {
    if (howmany >= (this.pool.length)) {
        init(java.lang.Math.max(howmany, ((this.pool.length) << 1)));
    }
    this.maxvarid = howmany;
}