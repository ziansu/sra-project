@java.lang.Override
public java.util.List<com.goodfood.model.CalcFood> getCalcByIdUser(com.goodfood.model.User user, java.util.Date dateBefore, java.util.Date dateAfter) {
    org.hibernate.Criteria criteria = getCurrentSession().createCriteria(com.goodfood.model.CalcFood.class).add(org.hibernate.criterion.Restrictions.eq("user", user)).add(org.hibernate.criterion.Restrictions.between("addDate", dateBefore, dateAfter)).addOrder(org.hibernate.criterion.Order.desc("addDate"));
    return criteria.list();
}