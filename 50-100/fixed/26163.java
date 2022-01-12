public static java.util.List<com.umasuo.product.application.dto.ProductDataView> build(java.util.List<com.umasuo.product.application.dto.ProductDataView> objects) {
    java.util.List<com.umasuo.product.application.dto.ProductDataView> result = com.google.common.collect.Lists.newArrayList();
    if (objects != null) {
        for (java.lang.Object view : objects) {
            java.util.LinkedHashMap map = ((java.util.LinkedHashMap) (view));
            result.add(com.umasuo.product.application.dto.ProductDataView.build(map));
        }
    }
    return result;
}