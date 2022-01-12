@org.springframework.web.bind.annotation.RequestMapping(value = "/removePurchaseCase", method = org.springframework.web.bind.annotation.RequestMethod.PUT)
public java.lang.String removeCommodity(@org.springframework.web.bind.annotation.RequestParam(value = "sellCaseId", required = true)
java.lang.String sellCaseId, @org.springframework.web.bind.annotation.RequestParam(value = "purchaseCaseIds", required = true)
java.lang.String[] purchaseCaseIds) {
    java.lang.Integer[] ids = new java.lang.Integer[purchaseCaseIds.length];
    for (int i = 0; i < (purchaseCaseIds.length); i++) {
        ids[i] = java.lang.Integer.valueOf(purchaseCaseIds[i]);
    }
    sellCaseService.deleteSellCaseIdFromPurchaseCases(ids);
    return com.jersey.sellCase.controller.SellCaseController.REDIRECT_ADD_PURCHASE_CASE.replace("{id}", sellCaseId);
}