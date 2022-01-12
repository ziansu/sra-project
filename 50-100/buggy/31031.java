@java.lang.Override
public java.lang.Boolean visit(org.lemsml.model.DerivedVariable derVar) throws org.lemsml.model.exceptions.LEMSCompilerException {
    javax.measure.Unit<?> dim = this.lems.getDimensionByName(derVar.getDimension());
    if ((derVar.getSelect()) != null) {
        unitContext.put(derVar.getName(), dim);
    }else {
        buildDependenciesAndContext(derVar.getName(), derVar.getValueDefinition(), dim);
    }
    return null;
}