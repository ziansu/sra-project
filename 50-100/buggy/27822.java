@java.lang.Override
public void updateEmployee(com.maaz.lms.entity.Employee emp) {
    org.hibernate.Session session = null;
    try {
        session = com.maaz.lms.util.HibernateUtil.getSessionFactory().openSession();
        session.update(emp);
    } catch (java.lang.Exception e) {
        com.maaz.lms.dao.EmployeeDaoImpl.logger.error("DAO Exception UpdateEmployee", e);
        e.printStackTrace();
    } finally {
        session.flush();
        session.close();
    }
}