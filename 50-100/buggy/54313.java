@org.junit.jupiter.params.ParameterizedTest
@org.junit.jupiter.params.provider.MethodSource(names = "daoAndSupplierProvider")
public void testingRemove(com.codecool.shop.dao.SupplierDao supplierDao, com.codecool.shop.model.Supplier testSupplier) {
    testSupplier.setId(1);
    int numOfItems = supplierDao.getAll().size();
    supplierDao.add(testSupplier);
    supplierDao.remove(1);
    assertEquals(numOfItems, supplierDao.getAll().size());
    com.codecool.shop.dao.SupplierDaoTest.cleanUp(supplierDao);
}