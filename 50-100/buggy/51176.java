@java.lang.Override
public void deleteApprovers(com.maaz.lms.entity.Approvers approver) {
    org.hibernate.Session session = null;
    try {
        session = com.maaz.lms.util.HibernateUtil.getSessionFactory().openSession();
        session.delete(approver);
    } catch (java.lang.Exception e) {
        com.maaz.lms.dao.EmployeeDaoImpl.logger.error("DAO Exception saveOrUpdateEmployee", e);
        e.printStackTrace();
    } finally {
        session.close();
    }
}