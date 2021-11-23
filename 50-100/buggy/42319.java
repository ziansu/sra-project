public com.vzome.core.algebra.AlgebraicNumber times(com.vzome.core.algebra.AlgebraicNumber that) {
    if (that.isZero())
        return this.field.zero();
    
    if (that.isOne())
        return this;
    
    return new com.vzome.core.algebra.AlgebraicNumber(this.field, this.field.multiply(this.factors, that.factors));
}