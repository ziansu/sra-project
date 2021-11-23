public hudson.util.ListBoxModel doFillStoreIdItems() {
    final java.util.List<org.jenkinsci.plugins.relution_publisher.configuration.global.Store> stores = this.globalConfiguration.getStores();
    final hudson.util.ListBoxModel items = new hudson.util.ListBoxModel();
    items.add("", "");
    for (final org.jenkinsci.plugins.relution_publisher.configuration.global.Store store : stores) {
        items.add(store.toString(), store.getId());
    }
    return items;
}