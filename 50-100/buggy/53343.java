public static final void createGeoEntity(net.geoprism.ClientRequestIF clientRequest, java.lang.String parentId, java.lang.String universalId, java.lang.String label) {
    java.lang.String[] _declaredTypes = new java.lang.String[]{ "java.lang.String" , "java.lang.String" , "java.lang.String" };
    java.lang.Object[] _parameters = new java.lang.Object[]{ parentId , universalId , label };
    net.geoprism.MethodMetaData _metadata = new net.geoprism.MethodMetaData(net.geoprism.DataUploaderDTO.CLASS, "createGeoEntity", _declaredTypes);
    clientRequest.invokeMethod(_metadata, null, _parameters);
}