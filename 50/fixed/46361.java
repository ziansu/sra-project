@java.lang.Override
public java.util.List<com.goodfood.model.Category> allCategory() {
    return getCurrentSession().createCriteria(com.goodfood.model.Category.class).list();
}