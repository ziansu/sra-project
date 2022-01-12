public java.util.List<nl.cimsolutions.snel_transport.models.Product> getAllProducts() {
    return findAll("SELECT p FROM Product p ORDER BY p.id");
}