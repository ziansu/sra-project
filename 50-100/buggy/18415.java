public void delete(java.lang.Integer id) {
    org.hibernate.Session session = sessionFactory.getCurrentSession();
    session.beginTransaction();
    java.lang.Long lid = new java.lang.Long(id.intValue());
    com.wipro.ats.bdre.md.dao.jpa.Weburlsdb weburlsdb = ((com.wipro.ats.bdre.md.dao.jpa.Weburlsdb) (session.get(com.wipro.ats.bdre.md.dao.jpa.Weburlsdb.class, lid)));
    if (weburlsdb != null)
        session.delete(weburlsdb);
    
    session.getTransaction().commit();
}