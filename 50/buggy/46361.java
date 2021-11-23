@java.lang.Override
public java.util.List<com.goodfood.model.Category> allCategory() {
    java.util.HashSet<com.goodfood.model.Category> setCategory = new java.util.HashSet(getCurrentSession().createCriteria(com.goodfood.model.Category.class).list());
    return new java.util.ArrayList<com.goodfood.model.Category>(setCategory);
}