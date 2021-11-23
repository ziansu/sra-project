public java.util.List<java.lang.String> existingEnrollNum(com.dexpert.feecollection.main.users.applicant.AppBean appBean) {
    org.hibernate.Session session = com.dexpert.feecollection.main.users.applicant.AppDAO.factory.openSession();
    try {
        org.hibernate.Criteria criteria = session.createCriteria(com.dexpert.feecollection.main.users.applicant.AppBean.class);
        criteria.setProjection(org.hibernate.criterion.Projections.property("enrollmentNumber"));
        criteria.add(org.hibernate.criterion.Restrictions.eq("enrollmentNumber", appBean.getEnrollmentNumber()));
        java.util.List<java.lang.String> list = criteria.list();
        return list;
    } finally {
        session.close();
    }
}