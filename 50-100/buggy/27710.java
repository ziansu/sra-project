public java.util.List<com.dexpert.feecollection.main.users.applicant.AppBean> getStudentDetailByEnrollMentNumber(java.lang.String enrollmentNumber) {
    org.hibernate.Session session = com.dexpert.feecollection.main.users.applicant.AppDAO.factory.openSession();
    try {
        org.hibernate.Criteria criteria = session.createCriteria(com.dexpert.feecollection.main.users.applicant.AppBean.class);
        criteria.add(org.hibernate.criterion.Restrictions.eq("enrollmentNumber", enrollmentNumber));
        java.util.List<com.dexpert.feecollection.main.users.applicant.AppBean> appBeanList = criteria.list();
        return appBeanList;
    } finally {
        session.close();
    }
}