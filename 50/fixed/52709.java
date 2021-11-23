void removeAll(java.util.Set<java.lang.String> items) {
    com.gilshelef.feedmeassociations.DataManager.donations.keySet().removeAll(items);
    com.gilshelef.feedmeassociations.AdapterManager.get().updateDataSourceAll();
}