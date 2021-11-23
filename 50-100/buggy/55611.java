@java.lang.Override
public com.is0967.menutri.dtos.DishDTO getDishById(java.lang.Long dishId) {
    com.is0967.menutri.dtos.DishDTO dto = null;
    try {
        com.is0967.menutri.services.Dish dish = dishRepo.findOne(dishId);
        dto = com.is0967.menutri.dtos.DishDTO.convertFromEntity(dish);
        java.util.List<com.is0967.menutri.services.DishCategoryDetail> dishCategoryDetails = dishCategoryDetailRepo.findByDishId(dishId);
        dto.setDishCategoryDetails(dishCategoryDetails);
        java.util.List<com.is0967.menutri.services.DishDetail> dishDetails = dishDetailRepo.findByDishId(dishId);
        dto.setDishDetails(dishDetails);
    } catch (java.lang.Exception e) {
        logger.error(e.getMessage());
    }
    return dto;
}