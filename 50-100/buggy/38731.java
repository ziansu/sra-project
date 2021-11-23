private org.overture.codegen.cgast.SExpCG consFieldValueToMatch(org.overture.codegen.cgast.expressions.AIdentifierVarExpCG patternVar, int fieldNumber, org.overture.codegen.cgast.STypeCG currentType, boolean cast) {
    if ((patternVar.getType()) instanceof org.overture.codegen.cgast.types.ATupleTypeCG) {
        return consTupleFieldExp(patternVar, fieldNumber, currentType, cast);
    }else
        if ((patternVar.getType()) instanceof org.overture.codegen.cgast.types.ARecordTypeCG) {
            return consRecFieldExp(patternVar, fieldNumber, currentType);
        }
    
    return null;
}