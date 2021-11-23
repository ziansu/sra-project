@javax.transaction.Transactional
public int deleteDecoratedProduct(int productLinker) {
    int numDeleted = 0;
    try {
        javax.persistence.Query query = em.createQuery("DELETE FROM Product p WHERE p.productLinker = :linker").setParameter("linker", productLinker);
        numDeleted = query.executeUpdate();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return numDeleted;
}