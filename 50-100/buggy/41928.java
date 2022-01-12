@java.lang.Override
public void load(java.util.Collection<java.lang.Object> objects) {
    java.util.Set<org.eclipse.osee.framework.skynet.core.artifact.Artifact> arts = new java.util.HashSet<org.eclipse.osee.framework.skynet.core.artifact.Artifact>();
    for (java.lang.Object obj : objects) {
        if (org.eclipse.osee.ats.util.AtsUtil.isAtsArtifact(obj)) {
            arts.add(((org.eclipse.osee.framework.skynet.core.artifact.Artifact) (obj)));
        }
    }
    try {
        org.eclipse.osee.ats.core.client.config.AtsBulkLoad.bulkLoadArtifacts(arts);
    } catch (org.eclipse.osee.framework.jdk.core.type.OseeCoreException ex) {
        org.eclipse.osee.framework.logging.OseeLog.log(org.eclipse.osee.ats.internal.Activator.class, java.util.logging.Level.SEVERE, ex);
    }
    setInput(arts);
}