public com.vzome.core.algebra.AlgebraicNumber plus(com.vzome.core.algebra.AlgebraicNumber that) {
    if (that.isZero())
        return this;
    
    int order = this.factors.length;
    com.vzome.core.algebra.BigRational[] sum = new com.vzome.core.algebra.BigRational[order];
    for (int i = 0; i < order; i++) {
        sum[i] = this.factors[i].plus(that.factors[i]);
    }
    return new com.vzome.core.algebra.AlgebraicNumber(this.field, sum);
}