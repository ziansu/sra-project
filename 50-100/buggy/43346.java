@java.lang.Override
public fi.nls.oskari.domain.map.view.View getViewWithConfByUuId(java.lang.String uuId) {
    if ((uuId != null) && (uuId.isEmpty())) {
        for (fi.nls.oskari.domain.map.view.View item : list) {
            if (uuId.equals(item.getUuid())) {
                return item;
            }
        }
    }
    return null;
}