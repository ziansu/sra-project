@java.lang.Override
public java.lang.Long countSimpleSearchResults(java.lang.String searchTerm) {
    javax.persistence.Query query = entityManager.createQuery(("Select count(e.id) from CertifiedProductDetailsEntity e " + (("where (NOT deleted = true) AND ((UPPER(vendor_name)  " + "LIKE UPPER(:vendorname)) OR (UPPER(product_name) LIKE UPPER(:productname))) ") + " ")), java.lang.Long.class);
    query.setParameter("vendorname", (("%" + searchTerm) + "%"));
    query.setParameter("productname", (("%" + searchTerm) + "%"));
    java.lang.Long count = ((java.lang.Long) (query.getSingleResult()));
    return count;
}