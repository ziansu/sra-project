public boolean deleteCameriere(int codCameriere) {
    org.hibernate.Session session = new org.hibernate.cfg.Configuration().configure().buildSessionFactory().openSession();
    cameriere = ((it.begear.model.Cameriere) (session.load(it.begear.model.Cameriere.class, new java.lang.Integer(codCameriere))));
    if (null != (cameriere)) {
        session.delete(cameriere);
    }
    return true;
}