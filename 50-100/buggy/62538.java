@java.lang.Override
public java.util.List findAllAppointment() {
    org.hibernate.Session session = core.service.SessionManager.getInstance().openSession();
    org.hibernate.Transaction tx = session.beginTransaction();
    java.util.List appointments = session.createQuery("FROM Appointment").list();
    session.close();
    return appointments;
}