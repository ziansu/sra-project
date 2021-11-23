@java.lang.Override
public void propertyChange(java.beans.PropertyChangeEvent evt) {
    if ("filterChanged".equals(evt.getPropertyName())) {
        if (java.lang.Boolean.TRUE.equals(evt.getNewValue())) {
            filterButton.setIcon(IconManager.FILTER_ACTIVE);
            filterButton.setToolTipText(org.tinymediamanager.ui.movies.MoviePanel.BUNDLE.getString("movieextendedsearch.options.active"));
        }else {
            filterButton.setIcon(IconManager.FILTER);
            filterButton.setToolTipText(org.tinymediamanager.ui.movies.MoviePanel.BUNDLE.getString("movieextendedsearch.options"));
        }
    }
}