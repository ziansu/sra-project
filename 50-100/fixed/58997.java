public static java.util.Map<org.eclipse.osee.framework.ui.skynet.search.QuickSearchOptionComposite.SearchOption, org.eclipse.osee.framework.ui.skynet.search.QuickSearchOptionComposite.IOptionConfigurationHandler<?>> getConfigurableOptions() {
    if ((org.eclipse.osee.framework.ui.skynet.search.QuickSearchOptionComposite.SearchOption.configurable) == null) {
        org.eclipse.osee.framework.ui.skynet.search.QuickSearchOptionComposite.SearchOption.configurable = new java.util.HashMap<org.eclipse.osee.framework.ui.skynet.search.QuickSearchOptionComposite.SearchOption, org.eclipse.osee.framework.ui.skynet.search.QuickSearchOptionComposite.IOptionConfigurationHandler<?>>();
        for (org.eclipse.osee.framework.ui.skynet.search.QuickSearchOptionComposite.SearchOption option : org.eclipse.osee.framework.ui.skynet.search.QuickSearchOptionComposite.SearchOption.values()) {
            if (option.isConfigurable()) {
                org.eclipse.osee.framework.ui.skynet.search.QuickSearchOptionComposite.SearchOption.configurable.put(option, option.getConfigHandler());
            }
        }
    }
    return org.eclipse.osee.framework.ui.skynet.search.QuickSearchOptionComposite.SearchOption.configurable;
}