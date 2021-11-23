@java.lang.Override
public final edu.clemson.cs.rsrg.absyn.expressions.Exp remember() {
    edu.clemson.cs.rsrg.absyn.expressions.Exp newWhere = null;
    if ((myWhereExp) != null) {
        newWhere = ((edu.clemson.cs.rsrg.absyn.expressions.mathexpr.MathExp) (myWhereExp)).remember();
    }
    edu.clemson.cs.rsrg.absyn.expressions.Exp newBody = ((edu.clemson.cs.rsrg.absyn.expressions.mathexpr.MathExp) (myBodyExp)).remember();
    return new edu.clemson.cs.rsrg.absyn.expressions.mathexpr.QuantExp(cloneLocation(), myQuantification, copyVars(), newWhere, newBody);
}