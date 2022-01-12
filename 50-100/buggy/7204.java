@java.lang.Override
public org.apache.tajo.datum.Datum terminate(org.apache.tajo.plan.function.FunctionContext ctx) {
    org.apache.tajo.engine.function.builtin.StdDevContext StdDevCtx = ((org.apache.tajo.engine.function.builtin.StdDevContext) (ctx));
    if ((StdDevCtx.count) == 0) {
        return org.apache.tajo.datum.NullDatum.get();
    }else
        if ((StdDevCtx.count) == 1) {
            return org.apache.tajo.datum.DatumFactory.createFloat8(0);
        }
    
    return org.apache.tajo.datum.DatumFactory.createFloat8(java.lang.Math.sqrt(((StdDevCtx.squareSumOfDiff) / ((StdDevCtx.count) - 1))));
}