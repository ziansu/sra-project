void createRoute(ru.fivt.dostavimvse.models.Order order) {
    org.hibernate.Session session = ru.fivt.dostavimvse.HibernateSessionFactory.getSessionFactory().openSession();
    session.beginTransaction();
    order.setStartDate(java.time.LocalDateTime.now());
}