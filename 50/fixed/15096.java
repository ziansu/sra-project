@java.lang.SuppressWarnings(value = "unchecked")
@java.lang.Override
public java.util.List<io.craigmiller160.school.entity.Course> getNextEntities(int lastPageLastRowNum, int pageSize) {
    return sessionFactory.getCurrentSession().createCriteria(io.craigmiller160.school.entity.Course.class).setFirstResult(lastPageLastRowNum).setMaxResults(pageSize).list();
}