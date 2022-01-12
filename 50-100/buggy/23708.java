public static java.util.List<org.ofbiz.entity.GenericValue> getRelatedCategoriesRet(javax.servlet.ServletRequest request, java.lang.String attributeName, java.lang.String parentId, boolean limitView, boolean excludeEmpty, boolean recursive) {
    org.ofbiz.entity.Delegator delegator = ((org.ofbiz.entity.Delegator) (request.getAttribute("delegator")));
    return org.ofbiz.product.category.CategoryWorker.getRelatedCategoriesRet(delegator, attributeName, parentId, limitView, excludeEmpty, false);
}