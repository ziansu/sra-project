@java.lang.Override
public void load(java.util.Collection<java.lang.Object> objects) {
    java.util.Set<org.eclipse.osee.framework.skynet.core.artifact.Artifact> arts = new java.util.HashSet<org.eclipse.osee.framework.skynet.core.artifact.Artifact>();
    for (java.lang.Object obj : objects) {
        if (org.eclipse.osee.ats.util.AtsUtil.isAtsArtifact(obj)) {
            arts.add(((org.eclipse.osee.framework.skynet.core.artifact.Artifact) (obj)));
        }
    }
    setInput(arts);
}