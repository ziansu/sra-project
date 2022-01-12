public void editDoctorProfile(com.mycompany.dao.Doctor doctor) {
    org.hibernate.SessionFactory sessionFactory = com.mycompany.hibernate.HibernateUtil.getSessionFactory();
    org.hibernate.Session session = sessionFactory.openSession();
    session.beginTransaction();
    session.update(doctor);
    session.getTransaction().commit();
}