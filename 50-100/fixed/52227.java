public com.dexpert.feecollection.main.users.affiliated.AffBean getStudentDetail(com.dexpert.feecollection.main.users.LoginBean bean) {
    org.hibernate.Session session = com.dexpert.feecollection.main.users.applicant.AppDAO.factory.openSession();
    java.lang.Integer id = bean.getAffBean().getInstId();
    org.hibernate.Criteria criteria = session.createCriteria(com.dexpert.feecollection.main.users.affiliated.AffBean.class);
    criteria.add(org.hibernate.criterion.Restrictions.eq("instId", id));
    com.dexpert.feecollection.main.users.affiliated.AffBean affBean = ((com.dexpert.feecollection.main.users.affiliated.AffBean) (criteria.list().iterator().next()));
    session.close();
    return affBean;
}