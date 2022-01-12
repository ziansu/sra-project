public boolean hideItem(java.lang.String item) {
    java.lang.String itemsToRemove = null;
    org.oscarehr.common.model.Property p = propertyDao.checkByName(org.oscarehr.managers.PreventionManager.HIDE_PREVENTION_ITEM);
    itemsToRemove = p.getValue();
    if (itemsToRemove != null) {
        java.util.List<java.lang.String> items = java.util.Arrays.asList(itemsToRemove.split("\\s*,\\s*"));
        for (java.lang.String i : items) {
            if (i.equals(item)) {
                return true;
            }
        }
    }
    return false;
}