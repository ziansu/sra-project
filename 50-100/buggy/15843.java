protected java.lang.Boolean isNodiscount(java.lang.String dishNo) {
    com.rci.bean.entity.Dish dish = dishService.findDishByNo(dishNo);
    if (dish == null) {
        dish = transformService.transformDishInfo(dishNo);
    }
    if (!(com.rci.enums.CommonEnums.YOrN.isY(dish.getDiscountFlag()))) {
        return true;
    }
    return false;
}