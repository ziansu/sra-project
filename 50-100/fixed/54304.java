@java.lang.Override
public org.geogebra.common.kernel.arithmetic.ExpressionValue handle(org.geogebra.common.kernel.arithmetic.ExpressionNodeEvaluator ev, org.geogebra.common.kernel.arithmetic.ExpressionValue lt, org.geogebra.common.kernel.arithmetic.ExpressionValue rt, org.geogebra.common.kernel.arithmetic.ExpressionValue left, org.geogebra.common.kernel.arithmetic.ExpressionValue right, org.geogebra.common.kernel.StringTemplate tpl, boolean holdsLaTeX) {
    if (lt instanceof org.geogebra.common.kernel.arithmetic.BooleanValue) {
        if (((org.geogebra.common.kernel.arithmetic.BooleanValue) (lt)).getBoolean()) {
            return rt;
        }
        return rt.getUndefinedCopy(ev.getKernel());
    }
    return ev.illegalArgument(lt, rt, "if(");
}