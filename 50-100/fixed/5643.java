public int getCurrentExamPaperNo(java.lang.String cid) {
    getSession().flush();
    org.hibernate.Criteria criteria = getSession().createCriteria(com.springapp.mvc.domain.exam.PaperGenerateTemplate.class);
    criteria.add(org.hibernate.criterion.Restrictions.eq("category.id", cid));
    criteria.addOrder(org.hibernate.criterion.Order.desc("id"));
    criteria.setMaxResults(1);
    com.springapp.mvc.domain.exam.PaperGenerateTemplate paperGenerateTemplate = ((com.springapp.mvc.domain.exam.PaperGenerateTemplate) (criteria.uniqueResult()));
    if (paperGenerateTemplate == null) {
        return 0;
    }else {
        return paperGenerateTemplate.getNo();
    }
}