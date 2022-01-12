public static org.geppetto.model.variables.Variable createTextTypeVariable(java.lang.String id, java.lang.String value, org.geppetto.core.model.GeppettoModelAccess access) throws org.geppetto.model.util.GeppettoVisitingException {
    org.geppetto.model.values.Text text = ValuesFactory.eINSTANCE.createText();
    text.setText(value);
    org.geppetto.model.variables.Variable variable = VariablesFactory.eINSTANCE.createVariable();
    variable.setId(org.geppetto.model.neuroml.utils.modeltree.PopulateGeneralModelTreeUtils.parseId(id));
    variable.setName(id);
    variable.getTypes().add(access.getType(TypesPackage.Literals.TEXT_TYPE));
    return variable;
}