private java.util.List<org.apache.ofbiz.entity.GenericValue> getCompleteList(java.util.Map<java.lang.String, java.lang.Object> context) {
    java.util.List<org.apache.ofbiz.entity.GenericValue> foundElements = new java.util.LinkedList<org.apache.ofbiz.entity.GenericValue>();
    try (org.apache.ofbiz.entity.util.EntityListIterator listIt = ((org.apache.ofbiz.entity.util.EntityListIterator) (context.get("listIt")))) {
        if (listIt != null) {
            foundElements = listIt.getCompleteList();
        }
    } catch (org.apache.ofbiz.entity.GenericEntityException e) {
        org.apache.ofbiz.base.util.Debug.logError(" Failed to extract values from EntityListIterator after a performFind service", org.apache.ofbiz.common.test.PerformFindTests.module);
    }
    return foundElements;
}