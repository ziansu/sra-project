public java.util.List<it.begear.model.Cameriere> getCamerieri() {
    org.hibernate.Session session = new org.hibernate.cfg.Configuration().configure().buildSessionFactory().openSession();
    org.hibernate.Transaction tx = null;
    tx = session.beginTransaction();
    java.util.List<it.begear.model.Cameriere> camerieri = ((java.util.List<it.begear.model.Cameriere>) (session.createCriteria(it.begear.model.Cameriere.class).list()));
    session.close();
    return camerieri;
}