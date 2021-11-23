public java.util.List<it.begear.model.Cameriere> getCamerieri() {
    org.hibernate.Session session = new org.hibernate.cfg.Configuration().configure().buildSessionFactory().openSession();
    session.beginTransaction();
    @java.lang.SuppressWarnings(value = "unchecked")
    java.util.List<it.begear.model.Cameriere> camerieri = ((java.util.List<it.begear.model.Cameriere>) (session.createCriteria(it.begear.model.Cameriere.class).list()));
    session.close();
    return camerieri;
}