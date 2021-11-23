@java.lang.Override
public java.util.List<com.goodfood.model.Food> getFoodForSearch(java.lang.String name) {
    java.lang.String sql = (("SELECT f.* FROM food f " + "WHERE  f.name LIKE '%") + name) + "%' ";
    java.util.List<com.goodfood.model.Food> foodList = getCurrentSession().createSQLQuery(sql).addEntity(com.goodfood.model.Food.class).list();
    return foodList;
}