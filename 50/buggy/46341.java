public void save() {
    saveFieldData();
    saveRequiredFieldMappingData();
    saveExpressionData();
    saveModelData();
    saveProcessTree();
    saveOpexData();
    saveFixedCostData();
    new com.org.gnos.services.EquationGenerator().generate();
}