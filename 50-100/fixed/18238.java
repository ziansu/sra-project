@org.junit.jupiter.params.ParameterizedTest
@org.junit.jupiter.params.provider.MethodSource(names = "daoAndSupplierProvider")
public void testingAdd(com.codecool.shop.dao.SupplierDao supplierDao, com.codecool.shop.model.Supplier testSupplier) {
    int numOfItems = supplierDao.getAll().size();
    supplierDao.add(testSupplier);
    testSupplier.setId(supplierDao.getAll().get(0).getId());
    assertEquals((numOfItems + 1), supplierDao.getAll().size());
}