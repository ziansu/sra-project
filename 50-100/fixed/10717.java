public boolean validatePurchaseCategoryCode(java.lang.String purchaseCategoryCode) throws java.lang.Exception {
    boolean isvalid = false;
    try {
        java.util.List<java.lang.String> validCategoris = apiDAO.getValidPurchaseCategories();
        if ((validCategoris.size()) > 0) {
            for (java.lang.String category : validCategoris) {
                if (category.equalsIgnoreCase(purchaseCategoryCode)) {
                    isvalid = true;
                    break;
                }
            }
        }
    } catch (java.lang.Exception e) {
        throw e;
    }
    return isvalid;
}