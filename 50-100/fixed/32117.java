public void merge(fi.nls.oskari.control.statistics.plugins.StatisticalIndicatorSelectors selectors2) {
    for (fi.nls.oskari.control.statistics.plugins.StatisticalIndicatorSelector selector : selectors2.getSelectors()) {
        fi.nls.oskari.control.statistics.plugins.StatisticalIndicatorSelector foundSelector = null;
        for (fi.nls.oskari.control.statistics.plugins.StatisticalIndicatorSelector originalSelector : this.selectors) {
            if (originalSelector.getId().equals(selector.getId())) {
                foundSelector = originalSelector;
            }
        }
        if (foundSelector == null) {
            this.selectors.add(selector);
        }
    }
}