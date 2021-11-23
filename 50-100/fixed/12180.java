public static void editStock(model.Stocks stock) {
    try {
        org.hibernate.SessionFactory sessionFactory = model.HibernateUtil.getSessionFactory();
        org.hibernate.Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(stock);
        session.getTransaction().commit();
        session.close();
    } catch (org.hibernate.HibernateException e) {
        e.printStackTrace();
    }
}