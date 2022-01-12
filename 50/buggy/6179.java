@java.lang.Override
public java.util.List<com.goodfood.model.Food> getAllFood() {
    return new java.util.ArrayList<com.goodfood.model.Food>(new java.util.HashSet<com.goodfood.model.Food>(getCurrentSession().createCriteria(com.goodfood.model.Food.class).list()));
}