@org.junit.jupiter.params.ParameterizedTest
@org.junit.jupiter.params.provider.MethodSource(names = "daoProvider")
public void testFind_FindSupplier_ReturnSupplierWithId(com.codecool.shop.dao.SupplierDao dao) {
    com.codecool.shop.model.Supplier amazon = new com.codecool.shop.model.Supplier("Amazon", "Digital content and services");
    dao.add(amazon);
    assertEquals(amazon, dao.find(amazon.getId()));
}