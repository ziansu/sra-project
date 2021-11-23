@java.lang.Override
public java.util.List<po.Dish> getDish(java.lang.String merchantId) {
    java.util.List<po.Dish> tmp = udao.findDishByMerchantId(merchantId);
    return tmp;
}