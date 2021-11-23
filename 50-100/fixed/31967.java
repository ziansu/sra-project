@java.lang.Override
public void modify(edu.unl.csce361.group4.cookbook.Ingredient ingredient) {
    java.lang.String sql = "UPDATE ingredients SET ingredient_name = ?, measuring_units = ?, " + ("retail_price = ?, serving_size = ?, container_amount = ? " + "WHERE ingredient_id = ?");
    dataSource.update(sql, new java.lang.Object[]{ ingredient.getIngredientName() , ingredient.getMeasuringUnits().toString() , ingredient.getRetailPrice() , ingredient.getServingSize() , ingredient.getContainerAmount() , ingredient.getIngredientId() });
}