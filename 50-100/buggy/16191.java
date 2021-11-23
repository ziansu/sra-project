protected java.lang.Integer[] getAllPortsServerWillUse(org.eclipse.wst.server.core.IServer server) {
    java.util.List<java.lang.Integer> ports = new java.util.ArrayList<>();
    java.lang.String axis2FilePath = getAxis2FilePath();
    java.lang.String carbonXmlPath = getCarbonXmlFilePath();
    java.lang.String catelinaXmlFilePath = getCatelinaXmlFilePath();
    addServletTransportPorts(ports, carbonXmlPath, catelinaXmlFilePath);
    addAxis2XmlPorts(ports, axis2FilePath);
    return ports.toArray(new java.lang.Integer[]{  });
}