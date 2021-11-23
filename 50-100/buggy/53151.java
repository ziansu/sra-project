public static final void createGeoEntitySynonym(net.geoprism.ClientRequestIF clientRequest, java.lang.String entityId, java.lang.String label) {
    java.lang.String[] _declaredTypes = new java.lang.String[]{ "java.lang.String" , "java.lang.String" };
    java.lang.Object[] _parameters = new java.lang.Object[]{ entityId , label };
    net.geoprism.MethodMetaData _metadata = new net.geoprism.MethodMetaData(net.geoprism.DataUploaderDTO.CLASS, "createGeoEntitySynonym", _declaredTypes);
    clientRequest.invokeMethod(_metadata, null, _parameters);
}