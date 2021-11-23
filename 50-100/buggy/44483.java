@java.lang.Override
public void filterBy(org.iplantc.de.client.models.notifications.NotificationCategory category) {
    currentCategory = category;
    toolbar.setCurrentCategory(category);
    com.sencha.gxt.data.shared.loader.FilterPagingLoadConfig config = view.getCurrentLoadConfig();
    com.sencha.gxt.data.shared.loader.FilterConfig filterBean = new com.sencha.gxt.data.shared.loader.FilterConfigBean();
    if (!(NotificationCategory.ALL.equals(currentCategory))) {
        filterBean.setField(currentCategory.toString());
    }
    java.util.List<com.sencha.gxt.data.shared.loader.FilterConfig> filters = new java.util.ArrayList<>();
    filters.add(filterBean);
    config.setFilters(filters);
    view.loadNotifications(config);
}