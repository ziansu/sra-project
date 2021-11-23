public void removeDocuments(org.csstudio.utility.toolbox.types.DocumentCategory documentCategory, org.csstudio.utility.toolbox.types.ForeignKey foreignKey) {
    javax.persistence.Query query = em.createNativeQuery(("delete from file_store where id in (select file_store_id from document " + " where foreign_key_id = :foreignKey and category = :category)"));
    query.setParameter("foreignKey", foreignKey.getId());
    query.setParameter("category", documentCategory.getValue());
    query.executeUpdate();
    query = em.createNativeQuery("delete from document where foreign_key_id = :foreignKey and category = :category");
    query.setParameter("foreignKey", foreignKey.getId());
    query.setParameter("category", documentCategory.getValue());
    query.executeUpdate();
}