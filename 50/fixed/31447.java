public java.util.List<org.jboss.as.quickstarts.helloworld.models.IOC> getIOCs() {
    javax.persistence.Query q = em.createQuery("select t from IOC t");
    java.util.List<org.jboss.as.quickstarts.helloworld.models.IOC> ioclist = q.getResultList();
    return ioclist;
}