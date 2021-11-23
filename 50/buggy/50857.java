private boolean isDishDiscountable(com.rci.bean.entity.Dish dish) {
    if (!(com.rci.enums.CommonEnums.YOrN.isY(dish.getDiscountFlag()))) {
        return true;
    }
    return false;
}