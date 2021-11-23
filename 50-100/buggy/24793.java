public int getDishPageCount(int pageSize, java.lang.Long categoryId) throws com.innovaee.eorder.exception.CategoryNotFoundException, com.innovaee.eorder.exception.InvalidPageSizeException {
    if (pageSize <= 0) {
        throw new com.innovaee.eorder.exception.InvalidPageSizeException(pageSize);
    }
    com.innovaee.eorder.entity.Category category = categoryDao.get(categoryId);
    int totalDishes = category.getDishes().size();
    return (totalDishes % pageSize) == 0 ? totalDishes / pageSize : (totalDishes / pageSize) + 1;
}