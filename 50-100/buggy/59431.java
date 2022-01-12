private void handleExecutables(java.util.List<org.overture.ast.definitions.PDefinition> defs) throws org.overture.ast.analysis.AnalysisException {
    for (org.overture.ast.definitions.PDefinition def : defs) {
        if (((def instanceof org.overture.ast.definitions.SOperationDefinition) || (def instanceof org.overture.ast.definitions.SFunctionDefinition)) || (def instanceof org.overture.ast.definitions.ANamedTraceDefinition)) {
            enclosingDef = def;
            enclosingCounter = 0;
            setNamesToAvoid(def);
            this.nameGen = new org.overture.codegen.ir.TempVarNameGen();
            def.apply(this);
        }
    }
}