private void getAnnotationMultiplePagesRegion(java.lang.reflect.Field field) {
    if (java.util.List.class.isAssignableFrom(field.getType())) {
        logger.error("MultiplePagesRegion can't be assigned to a List field");
        return ;
    }
    us.codecraft.webmagic.modelSpider.MultiplePagesField multiplePagesField = field.getAnnotation(us.codecraft.webmagic.modelSpider.MultiplePagesField.class);
    if (multiplePagesField != null) {
        multiPageSelector = new us.codecraft.webmagic.selector.XpathSelector(multiplePagesField.multiPageRegion());
        multiPageFieldName = field.getName();
    }
}