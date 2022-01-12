public void addObjectClassInfo(java.lang.String adaptationId, com.longyg.frontend.model.ars.om.ObjectClassInfo oci) {
    if (ociMap.containsKey(adaptationId)) {
        java.util.TreeSet<com.longyg.frontend.model.ars.om.ObjectClassInfo> ociSet = ociMap.get(adaptationId);
        if (!(ociSet.contains(oci))) {
            ociSet.add(oci);
        }
    }else {
        java.util.TreeSet<com.longyg.frontend.model.ars.om.ObjectClassInfo> ociSet = new java.util.TreeSet<>();
        ociSet.add(oci);
        ociMap.put(adaptationId, ociSet);
    }
}