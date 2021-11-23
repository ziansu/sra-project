public static java.lang.Class<? extends org.hibernate.cfg.AnnotationConfiguration> getHibernateConfigurationClass(java.lang.Class<? extends com.github.sarxos.hbrs.hb.PersistenceKeeper> clazz) {
    java.lang.Class<? extends org.hibernate.cfg.AnnotationConfiguration> cfg = com.github.sarxos.hbrs.hb.PersistenceKeeperImpl.CONFIGS.get(clazz);
    if (cfg != null) {
        return null;
    }
    com.github.sarxos.hbrs.hb.PersistentFactory pf = clazz.getAnnotation(com.github.sarxos.hbrs.hb.PersistentFactory.class);
    if (pf == null) {
        return null;
    }
    return pf.configuration();
}