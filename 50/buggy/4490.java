public javax.persistence.EntityManagerFactory createEntityManagerFactory(java.lang.String s, java.util.Map map) {
    java.lang.System.out.println("createEntityManagerFactory");
    return new com.spaceprogram.simplejpa.EntityManagerFactoryImpl(s, map);
}