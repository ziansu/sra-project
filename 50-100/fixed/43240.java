public void updateMany(java.util.List li) {
    if ((li != null) && (!(li.isEmpty()))) {
        org.hibernate.Session session = getSessionFactory().openSession();
        session.beginTransaction();
        for (java.lang.Object o : ((java.util.List<java.lang.Object>) (li))) {
            session.update(o);
        }
        session.getTransaction().commit();
        session.close();
    }
}