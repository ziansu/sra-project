public javax.persistence.EntityManagerFactory createContainerEntityManagerFactory(javax.persistence.spi.PersistenceUnitInfo persistenceUnitInfo, java.util.Map map) {
    java.lang.System.out.println("createContainerEntityManagerFactory");
    return new com.spaceprogram.simplejpa.EntityManagerFactoryImpl(persistenceUnitInfo, map);
}