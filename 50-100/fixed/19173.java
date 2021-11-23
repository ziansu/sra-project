static java.util.List<org.apache.atlas.typesystem.Referenceable> buildTalendComponents(final java.util.List<org.talend.cloudera.navigator.api.NavigatorNode> navigatorNodes) {
    java.util.List<org.apache.atlas.typesystem.Referenceable> refs = new java.util.ArrayList<>();
    for (org.talend.cloudera.navigator.api.NavigatorNode navigatorNode : navigatorNodes) {
        org.apache.atlas.typesystem.Referenceable ref = org.talend.lineage.atlas.TalendModelFactory.buildTalendComponent(navigatorNode);
        refs.add(ref);
    }
    return refs;
}