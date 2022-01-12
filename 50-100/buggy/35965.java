@java.lang.Override
protected ar.edu.itba.it.paw.model.Dish generate(java.sql.ResultSet rs) throws java.sql.SQLException {
    return new ar.edu.itba.it.paw.model.Dish(rs.getLong(ar.edu.itba.it.paw.db.DishDatabase.ID), rs.getLong(ar.edu.itba.it.paw.db.DishDatabase.RESTAURANT_ID), rs.getString(ar.edu.itba.it.paw.db.DishDatabase.NAME), rs.getString(ar.edu.itba.it.paw.db.DishDatabase.DESCRIPTION), rs.getInt(ar.edu.itba.it.paw.db.DishDatabase.PRICE), ar.edu.itba.it.paw.util.DishTypeUtils.getDishTypeFromString(rs.getString(ar.edu.itba.it.paw.db.DishDatabase.TYPE)));
}