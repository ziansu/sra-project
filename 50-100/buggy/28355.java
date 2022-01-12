@java.lang.Override
public cmu.conditional.Conditional<gov.nasa.jpf.vm.Instruction> apply(de.fosd.typechef.featureexpr.FeatureExpr ctx, final java.lang.Double v1) {
    if (v1 == 0) {
        return new cmu.conditional.One(ti.createAndThrowException(ctx, "java.lang.ArithmeticException", "division by zero"));
    }
    frame.push(ctx, v2.map(new cmu.conditional.Function<java.lang.Double, java.lang.Double>() {
        @java.lang.Override
        public java.lang.Double apply(java.lang.Double v2) {
            return (v2.doubleValue()) / (v1.doubleValue());
        }
    }));
    return getNext(ctx, ti);
}