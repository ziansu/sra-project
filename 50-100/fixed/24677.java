public final void notifyRemove(geogebra.common.kernel.geos.GeoElementInterface geo) {
    if (notifyViewsActive) {
        for (int i = 0; i < (viewCnt); ++i) {
            if (((views[i].getViewID()) != (geogebra.common.main.AbstractApplication.VIEW_CONSTRUCTION_PROTOCOL)) || (isNotifyConstructionProtocolViewAboutAddRemoveActive())) {
                views[i].remove(geo);
            }
        }
    }
    notifyRenameListenerAlgos();
}