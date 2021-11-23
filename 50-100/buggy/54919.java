public java.util.List<com.springapp.mvc.domain.exam.ExamPaper> getAllPapers() {
    com.springapp.mvc.util.HibernateUtil.getSession().flush();
    com.springapp.mvc.util.HibernateUtil.beginTransaction();
    org.hibernate.Criteria criteria = getSession().createCriteria(com.springapp.mvc.domain.exam.ExamPaper.class);
    criteria.add(org.hibernate.criterion.Restrictions.ne("paperStatus.id", 4));
    criteria.add(org.hibernate.criterion.Restrictions.ne("code", "SYSTM"));
    criteria.addOrder(org.hibernate.criterion.Order.asc("id"));
    java.util.List<com.springapp.mvc.domain.exam.ExamPaper> papers = criteria.list();
    com.springapp.mvc.util.HibernateUtil.commitTransaction();
    return papers;
}