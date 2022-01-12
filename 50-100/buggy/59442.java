@java.lang.Override
public cmu.conditional.Conditional<gov.nasa.jpf.vm.Instruction> apply(de.fosd.typechef.featureexpr.FeatureExpr ctx, final java.lang.Float v1) {
    if (v1 == 0) {
        return new cmu.conditional.One(ti.createAndThrowException(ctx, "java.lang.ArithmeticException", "division by zero"));
    }
    frame.push(ctx, v2.map(new cmu.conditional.Function<java.lang.Float, java.lang.Float>() {
        @java.lang.Override
        public java.lang.Float apply(java.lang.Float v2) {
            return (v2.floatValue()) % (v1.floatValue());
        }
    }));
    return getNext(ctx, ti);
}