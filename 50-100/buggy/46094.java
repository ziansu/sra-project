public java.util.List<com.projection.domain.Dishes> getAll() {
    java.util.List<com.projection.domain.Dishes> dishes = dishesDao.getAll();
    for (com.projection.domain.Dishes dish : dishes) {
        if ((dish.getValid()) == 0) {
            dishes.remove(dish);
        }
    }
    return dishesDao.getAll();
}