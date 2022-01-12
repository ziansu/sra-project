public static void initNavigationItem() {
    plugins.cms.navigation.NavigationCache.items.clear();
    java.util.List<models.cms.NavigationItem> roots = models.cms.NavigationItem.findByParent(null);
    plugins.cms.navigation.NavigationCache.createItemsForNavigationItems(roots);
}