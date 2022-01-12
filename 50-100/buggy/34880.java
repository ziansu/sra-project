@java.lang.Override
public void saveEmployee(com.maaz.lms.entity.Employee emp) {
    org.hibernate.Session session = null;
    try {
        session = com.maaz.lms.util.HibernateUtil.getSessionFactory().openSession();
        session.save(emp);
    } catch (java.lang.Exception e) {
        com.maaz.lms.dao.EmployeeDaoImpl.logger.error("DAO Exception saveEmployee", e);
        e.printStackTrace();
    } finally {
        session.close();
    }
}