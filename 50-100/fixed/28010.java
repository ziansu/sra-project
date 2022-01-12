private void pushPlainValue(de.fosd.typechef.featureexpr.FeatureExpr ctx, int value, boolean isRef) {
    resize();
    if (ctx.equivalentTo(stackCTX)) {
        slots[(++(size))] = new gov.nasa.jpf.vm.va.One(new gov.nasa.jpf.vm.va.Entry(value, isRef));
    }else {
        slots[(++(size))] = gov.nasa.jpf.vm.va.ChoiceFactory.create(ctx, new gov.nasa.jpf.vm.va.One(new gov.nasa.jpf.vm.va.Entry(value, isRef)), ((gov.nasa.jpf.vm.va.Conditional<gov.nasa.jpf.vm.va.Entry>) (One.NULL)));
    }
}