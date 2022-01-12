public static java.lang.String publishLayers(java.lang.String id, java.lang.String universalId, java.lang.String existingLayerNames) {
    net.geoprism.ontology.LocationLayerPublisher publisher = new net.geoprism.ontology.LocationLayerPublisher(id, universalId, existingLayerNames);
    java.io.StringWriter writer = new java.io.StringWriter();
    org.json.JSONWriter jw = new org.json.JSONWriter(writer);
    publisher.writeGeojson(jw);
    return writer.toString();
}