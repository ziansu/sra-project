private static java.util.Collection<org.apache.ivy.core.module.descriptor.Artifact> findArtifactsMatching(org.apache.ivy.core.module.descriptor.IncludeRule rule, java.util.Map<org.apache.ivy.core.module.id.ArtifactId, org.apache.ivy.core.module.descriptor.Artifact> allArtifacts) {
    java.util.Collection<org.apache.ivy.core.module.descriptor.Artifact> ret = new java.util.ArrayList<org.apache.ivy.core.module.descriptor.Artifact>();
    for (java.util.Map.Entry<org.apache.ivy.core.module.id.ArtifactId, org.apache.ivy.core.module.descriptor.Artifact> entry : allArtifacts.entrySet()) {
        if (org.apache.ivy.plugins.matcher.MatcherHelper.matches(rule.getMatcher(), rule.getId(), entry.getKey())) {
            ret.add(entry.getValue());
        }
    }
    return ret;
}