@org.junit.jupiter.params.ParameterizedTest
@org.junit.jupiter.params.provider.MethodSource(names = "daoAndSupplierProvider")
public void testingAdd(com.codecool.shop.dao.SupplierDao supplierDao, com.codecool.shop.model.Supplier testSupplier) {
    testSupplier.setId(1);
    int numOfItems = supplierDao.getAll().size();
    supplierDao.add(testSupplier);
    assertEquals((numOfItems + 1), supplierDao.getAll().size());
    supplierDao.remove(1);
    com.codecool.shop.dao.SupplierDaoTest.cleanUp(supplierDao);
}