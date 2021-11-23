private org.zunpeng.service.product.SimpleProductInfo trans2SimpleProductInfo(org.zunpeng.domain.ProductInfo productInfo) {
    if (productInfo == null) {
        return null;
    }
    org.zunpeng.service.product.SimpleProductInfo simpleProductInfo = com.oldpeng.core.utils.BeanCopyUtils.copy(productInfo, org.zunpeng.service.product.SimpleProductInfo.class);
    simpleProductInfo.setPrice(com.oldpeng.core.utils.MathUtils.convert2Dollar(productInfo.getAmount()));
    simpleProductInfo.setCoverUrl(imageService.buildUrl(productInfo.getCoverImg()));
    return simpleProductInfo;
}