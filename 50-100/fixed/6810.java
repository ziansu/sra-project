private pcbuilder.controllers.Component findComponent(pcbuilder.controllers.ProductData productData) {
    pcbuilder.controllers.Component component = componentRepository.findByManufacturerPartNumber(productData.getMpn());
    if (((component == null) && ((productData.getEan()) != null)) && (!(productData.getEan().equals("9999999999999")))) {
        component = componentRepository.findByEuropeanArticleNumber(productData.getEan()).get(0);
    }
    return component;
}