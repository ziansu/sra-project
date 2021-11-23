@org.junit.Before
public void createEntityManager() {
    entityManager = org.esbtools.message.admin.common.EsbMessageAdminTestBase.entityManagerFactory.createEntityManager();
    if (!(entityManager.getTransaction().isActive())) {
        entityManager.getTransaction().begin();
    }
    service = new org.esbtools.message.admin.common.EsbMessageAdminServiceImpl();
    service.setErrorEntityManager(entityManager);
    java.util.List<org.esbtools.message.admin.model.MetadataField> searchKeys = new java.util.ArrayList<org.esbtools.message.admin.model.MetadataField>();
    service.setKeyExtractor(new org.esbtools.message.admin.common.extractor.KeyExtractorUtil(searchKeys, ""));
}