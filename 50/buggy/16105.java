public static void initializeEntities(java.lang.Object entity, java.lang.String... properties) {
    for (java.lang.String props : properties) {
        com.streetstat.dao.util.HibernateInitializer.recursiveInitializeEntities(entity, props.split("\\."), 0);
    }
}