static java.util.List<org.apache.atlas.typesystem.Referenceable> buildTalendComponents(final java.util.List<org.talend.cloudera.navigator.api.NavigatorNode> navigatorNodes) {
    java.util.Map<java.lang.String, org.apache.atlas.typesystem.Referenceable> refs = new java.util.LinkedHashMap();
    for (org.talend.cloudera.navigator.api.NavigatorNode navigatorNode : navigatorNodes) {
        org.apache.atlas.typesystem.Referenceable ref = org.talend.lineage.atlas.TalendModelFactory.buildTalendComponent(navigatorNode);
        refs.put(navigatorNode.getName(), ref);
    }
    return new java.util.ArrayList(refs.values());
}