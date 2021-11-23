@java.lang.SuppressWarnings(value = "unchecked")
private java.util.List<com.example.entity.Job> getJobDetailsById(java.math.BigDecimal id) {
    com.example.dao.CreateJobInfoDAO.LOG.info(("Search user job by client Id :" + id));
    return hibernateTemplate.getSessionFactory().getCurrentSession().createCriteria(com.example.entity.Job.class).add(org.hibernate.criterion.Restrictions.eq("id", id)).list();
}