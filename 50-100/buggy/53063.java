@java.lang.Override
public void addAssumeValueInRangeStatements(de.uni_freiburg.informatik.ultimate.core.model.models.ILocation loc, de.uni_freiburg.informatik.ultimate.boogie.ast.Expression expr, de.uni_freiburg.informatik.ultimate.cdt.translation.implementation.container.c.CType cType, java.util.List<de.uni_freiburg.informatik.ultimate.boogie.ast.Statement> stmt) {
    if (mAssumeThatSignedValuesAreInRange) {
        if (cType.getUnderlyingType().isIntegerType()) {
            final de.uni_freiburg.informatik.ultimate.cdt.translation.implementation.container.c.CPrimitive cPrimitive = ((de.uni_freiburg.informatik.ultimate.cdt.translation.implementation.container.c.CPrimitive) (de.uni_freiburg.informatik.ultimate.cdt.translation.implementation.container.c.CEnum.replaceEnumWithInt(cType)));
            if (!(cPrimitive.isUnsigned())) {
                stmt.add(constructAssumeInRangeStatement(mTypeSizes, loc, expr, cPrimitive));
            }
        }
    }
}