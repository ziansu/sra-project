public boolean equals(java.lang.Object obj) {
    if (!(obj instanceof org.jenkinsci.plugins.coordinator.model.TreeNode)) {
        return false;
    }
    org.jenkinsci.plugins.coordinator.model.TreeNode node = ((org.jenkinsci.plugins.coordinator.model.TreeNode) (obj));
    return org.apache.commons.lang.builder.EqualsBuilder.reflectionEquals(this, node, org.jenkinsci.plugins.coordinator.model.TreeNode.REFLECTION_EXCLUDE_FIELDS);
}