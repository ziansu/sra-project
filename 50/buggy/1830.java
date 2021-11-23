public javax.persistence.EntityManagerFactory getEntityManagerFactory(java.util.Map<java.lang.String, java.lang.String> properties) {
    java.lang.String persistenceUnitName = uk.ac.ebi.fg.core_model.resources.Resources.resourceProperties.getProperty("uk.ac.ebi.fg.models.persistenceUnit", "ebiFgModelsPersistenceUnit");
    return getEntityManagerFactory(persistenceUnitName, null);
}