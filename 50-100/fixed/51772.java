private java.util.List<jkind.lustre.Type> gatherLustreTypes(org.eclipse.emf.common.util.EList<com.rockwellcollins.atc.agree.agree.SpecStatement> specs) {
    java.util.List<jkind.lustre.Type> types = new java.util.ArrayList<>();
    for (com.rockwellcollins.atc.agree.agree.SpecStatement spec : specs) {
        if (spec instanceof com.rockwellcollins.atc.agree.agree.RecordDefExpr) {
            com.rockwellcollins.atc.agree.analysis.AgreeTypeUtils.getType(((org.osate.aadl2.NamedElement) (spec)), com.rockwellcollins.atc.agree.analysis.ast.AgreeASTBuilder.typeMap, com.rockwellcollins.atc.agree.analysis.ast.AgreeASTBuilder.globalTypes);
        }
    }
    return types;
}