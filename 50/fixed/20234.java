@java.lang.Override
public java.lang.String getValue(org.gwtopenmaps.openlayers.client.feature.VectorFeature feature) {
    if ((feature.getAttributes().getAttributeAsString(attributeName)) == null) {
        return "";
    }else {
        return "" + (feature.getAttributes().getAttributeAsString(attributeName));
    }
}