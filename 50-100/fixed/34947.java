private void checkVar(java.lang.String name, org.overture.interpreter.values.Value v) throws org.overture.ast.analysis.AnalysisException {
    for (org.overturetool.tempoui.ModelBinder.VarBindInfo bv : vars2Bind) {
        if (bv.name().equals(name)) {
            if (v instanceof org.overture.interpreter.values.UpdatableValue) {
                org.overture.interpreter.values.UpdatableValue u = ((org.overture.interpreter.values.UpdatableValue) (v));
                org.overturetool.tempoui.ValueReflectors.reflectIntoData(u, bv, data);
                u.addListener(new org.overturetool.tempoui.UiBindListener(data, bv));
                break;
            }
        }
    }
}