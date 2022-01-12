public void insertIOC(java.lang.String name, java.lang.String desc, java.lang.String ip) {
    em.getTransaction().begin();
    org.jboss.as.quickstarts.helloworld.models.IOC ioc = new org.jboss.as.quickstarts.helloworld.models.IOC();
    ioc.setDescription(desc);
    ioc.setIp(ip);
    ioc.setName(name);
    em.persist(ioc);
    em.getTransaction().commit();
    em.close();
}