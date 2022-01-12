public java.util.List<com.dexpert.feecollection.main.users.applicant.AppBean> getAllStudentList() {
    org.hibernate.Session session = com.dexpert.feecollection.main.users.applicant.AppDAO.factory.openSession();
    try {
        org.hibernate.Criteria criteria = session.createCriteria(com.dexpert.feecollection.main.users.applicant.AppBean.class);
        java.util.List<com.dexpert.feecollection.main.users.applicant.AppBean> list = criteria.list();
        return list;
    } finally {
        session.close();
    }
}