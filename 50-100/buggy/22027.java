public static org.eclipse.ecf.mgmt.scr.ComponentReferenceMTO[] createMTOs(org.apache.felix.scr.Reference[] references) {
    java.util.List<org.eclipse.ecf.mgmt.scr.ComponentReferenceMTO> results = new java.util.ArrayList<org.eclipse.ecf.mgmt.scr.ComponentReferenceMTO>();
    for (org.apache.felix.scr.Reference r : references)
        results.add(org.eclipse.ecf.mgmt.scr.ComponentReferenceMTO.createMTO(r));
    
    return results.toArray(new org.eclipse.ecf.mgmt.scr.ComponentReferenceMTO[results.size()]);
}