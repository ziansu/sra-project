public static void deleteGig(int id) {
    org.hibernate.Session session = com.rh.gigs.GigDao.sessionFactory.openSession();
    com.rh.gigs.Gig gig = session.get(com.rh.gigs.Gig.class, id);
    session.beginTransaction();
    session.delete(gig);
    session.getTransaction().commit();
    session.close();
}