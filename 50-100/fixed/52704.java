protected org.openforis.idm.model.CoordinateAttribute attribute(org.openforis.collect.android.viewmodel.UiCoordinateAttribute uiAttribute, org.openforis.idm.metamodel.NodeDefinition definition) {
    org.openforis.idm.model.CoordinateAttribute a = new org.openforis.idm.model.CoordinateAttribute(((org.openforis.idm.metamodel.CoordinateAttributeDefinition) (definition)));
    if (!(uiAttribute.isCalculated())) {
        org.openforis.idm.model.Coordinate coordinate = ((org.openforis.idm.model.Coordinate) (value(uiAttribute)));
        a.setValue(coordinate);
    }
    return a;
}