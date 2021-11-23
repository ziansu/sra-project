private static void setTableFeatureProperty(org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.feature.prop.type.table.feature.prop.type.Wildcards propType, org.opendaylight.yang.gen.v1.urn.opendaylight.openflow.protocol.rev130731.table.features.properties.grouping.TableFeaturePropertiesBuilder propBuilder) {
    java.util.List<org.opendaylight.openflowplugin.openflow.md.core.sal.convertor.SetFieldMatch> setFieldMatch = null;
    org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.feature.prop.type.table.feature.prop.type.wildcards.WildcardSetfield wildcardSetField = propType.getWildcardSetfield();
    if (null != wildcardSetField) {
        setFieldMatch = wildcardSetField.getSetFieldMatch();
    }
    org.opendaylight.openflowplugin.openflow.md.core.sal.convertor.TableFeaturesConvertor.setSetFieldTableFeatureProperty(propBuilder, TableFeaturesPropType.OFPTFPTWILDCARDS, (setFieldMatch == null ? new java.util.ArrayList<org.opendaylight.openflowplugin.openflow.md.core.sal.convertor.SetFieldMatch>() : setFieldMatch));
}