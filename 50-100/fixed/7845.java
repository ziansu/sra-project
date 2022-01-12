public com.mycompany.dao.Doctor addDoctor(com.mycompany.dao.Doctor doctor) {
    org.hibernate.SessionFactory sessionFactory = com.mycompany.hibernate.HibernateUtil.getSessionFactory();
    org.hibernate.Session session = sessionFactory.openSession();
    session.beginTransaction();
    session.save(doctor);
    session.getTransaction().commit();
    return doctor;
}