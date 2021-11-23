public blimpl.promotionbl.PromotionVO POToVO(po.PromotionPO promotionPO) {
    try {
        java.lang.reflect.Method[] factoryMethods = blimpl.promotionbl.PromotionFactory.class.getDeclaredMethods();
        java.util.Arrays.sort(factoryMethods, new blimpl.promotionbl.PromotionMethodComparator());
        return ((blimpl.promotionbl.PromotionVO) (factoryMethods[promotionPO.getPromotionType().ordinal()].invoke(promotionPO)));
    } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException e) {
        e.printStackTrace();
    }
    return null;
}