public void testDataTypesNull() {
    siena.base.test.model.DataTypes dataTypes = new siena.base.test.model.DataTypes();
    pm.insert(dataTypes).get();
    assertEqualsDataTypes(dataTypes, pm.createQuery(siena.base.test.model.DataTypes.class).get().get());
}