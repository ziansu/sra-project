@org.junit.jupiter.params.ParameterizedTest
@org.junit.jupiter.params.provider.MethodSource(names = "daoAndSupplierProvider")
public void testingRemove(com.codecool.shop.dao.SupplierDao supplierDao, com.codecool.shop.model.Supplier testSupplier) {
    testSupplier.setId(1);
    int numOfItems = supplierDao.getAll().size();
    supplierDao.add(testSupplier);
    int id = supplierDao.getAll().get(0).getId();
    testSupplier.setId(id);
    supplierDao.remove(id);
    assertEquals(numOfItems, supplierDao.getAll().size());
}