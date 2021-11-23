@org.junit.Test
public void addTest() {
    Supplier savedSupplier = ((Supplier) (model.get(airCanada.getId())));
    assertEquals(airCanada.getName(), savedSupplier.getName());
}