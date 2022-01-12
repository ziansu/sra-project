public com.dexpert.feecollection.main.users.applicant.AppBean viewApplicantDetail(java.lang.String appId) {
    org.hibernate.Session session = com.dexpert.feecollection.main.users.applicant.AppDAO.factory.openSession();
    try {
        org.hibernate.Criteria criteria = session.createCriteria(com.dexpert.feecollection.main.users.applicant.AppBean.class);
        criteria.add(org.hibernate.criterion.Restrictions.eq("enrollmentNumber", appId));
        com.dexpert.feecollection.main.users.applicant.AppBean appBean = ((com.dexpert.feecollection.main.users.applicant.AppBean) (criteria.list().iterator().next()));
        return appBean;
    } finally {
        session.close();
    }
}