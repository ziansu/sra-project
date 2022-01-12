public java.util.List<com.projection.domain.Dishes> getAll() {
    java.util.List<com.projection.domain.Dishes> dishes = dishesDao.getAll();
    java.util.List<com.projection.domain.Dishes> result = new java.util.ArrayList<>();
    for (com.projection.domain.Dishes dish : dishes) {
        if ((dish.getValid()) == 1) {
            result.add(dish);
        }
    }
    return result;
}