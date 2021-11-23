private static void setTableFeatureProperty(org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.feature.prop.type.table.feature.prop.type.Match propType, org.opendaylight.yang.gen.v1.urn.opendaylight.openflow.protocol.rev130731.table.features.properties.grouping.TableFeaturePropertiesBuilder propBuilder) {
    org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.feature.prop.type.table.feature.prop.type.match.MatchSetfield matchSetField = propType.getMatchSetfield();
    java.util.List<org.opendaylight.openflowplugin.openflow.md.core.sal.convertor.SetFieldMatch> setFieldMatch = null;
    if (null != matchSetField) {
        setFieldMatch = matchSetField.getSetFieldMatch();
    }
    org.opendaylight.openflowplugin.openflow.md.core.sal.convertor.TableFeaturesConvertor.setSetFieldTableFeatureProperty(propBuilder, TableFeaturesPropType.OFPTFPTMATCH, (setFieldMatch == null ? new java.util.ArrayList<org.opendaylight.openflowplugin.openflow.md.core.sal.convertor.SetFieldMatch>() : setFieldMatch));
}