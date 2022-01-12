@org.springframework.web.bind.annotation.RequestMapping(value = "/addCommodity", method = org.springframework.web.bind.annotation.RequestMethod.PUT)
public java.lang.String addCommodity(@org.springframework.web.bind.annotation.RequestParam(value = "purchaseCaseId", required = true)
java.lang.String purchaseCaseId, @org.springframework.web.bind.annotation.RequestParam(value = "commodityIds", required = true)
java.lang.String[] commodityIds) {
    java.lang.Integer[] ids = new java.lang.Integer[commodityIds.length];
    for (int i = 0; i < (commodityIds.length); i++) {
        ids[i] = java.lang.Integer.valueOf(commodityIds[i]);
    }
    purchaseCaseService.addPurchaseCaseIdToCommoditys(purchaseCaseId, ids);
    return com.jersey.purchaseCase.controller.PurchaseCaseController.REDIRECT_ADD_COMMODITY.replace("{id}", purchaseCaseId);
}