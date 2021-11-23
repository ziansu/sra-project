@java.lang.Override
protected org.eclipse.emf.ecore.EObject getEObjectByID(java.lang.String id) {
    org.eclipse.emf.ecore.EObject idObject = super.getEObjectByID(id);
    if (idObject == null) {
        for (org.eclipse.emf.ecore.EObject eObject : getContents()) {
            if (eObject instanceof no.hal.pgo.osm.OSM) {
                no.hal.pgo.osm.Tagged tagged = no.hal.pgo.osm.util.OsmResourceImpl.getTagged(id, eObject, OsmPackage.eINSTANCE.getOSM_Nodes(), OsmPackage.eINSTANCE.getOSM_Relations());
                if (tagged != null) {
                    return tagged;
                }
            }
        }
    }
    return idObject;
}