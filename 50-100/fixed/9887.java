@java.lang.Override
public fi.nls.oskari.domain.map.view.View getViewWithConf(java.lang.String viewName) {
    if ((viewName != null) && (!(viewName.isEmpty()))) {
        for (fi.nls.oskari.domain.map.view.View item : list) {
            if (viewName.equals(item.getName())) {
                return item;
            }
        }
    }
    return null;
}