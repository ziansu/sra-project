@java.lang.Override
public java.util.List<po.Dish> getDish(java.lang.String merchantId) {
    return udao.findDishByMerchantId(merchantId);
}