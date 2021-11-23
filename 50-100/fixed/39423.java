@java.lang.SuppressWarnings(value = "unchecked")
@java.lang.Override
public java.util.List<org.exadel.training.model.Training> getContinuousTrainings(long id) {
    org.exadel.training.model.Training training = getTrainingById(id);
    java.lang.String title = training.getTitle();
    java.lang.String name = title.substring(0, title.lastIndexOf("#"));
    return sessionFactory.getCurrentSession().createCriteria(org.exadel.training.model.Training.class).add(org.hibernate.criterion.Restrictions.like("title", (name + "#%"))).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).addOrder(org.hibernate.criterion.Order.asc("title")).list();
}