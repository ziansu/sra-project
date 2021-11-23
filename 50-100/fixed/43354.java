public static boolean isValidWKT(java.lang.String wkt) throws net.sharkfw.knowledgeBase.SharkKBException {
    com.vividsolutions.jts.geom.Geometry jtsGeometry = null;
    com.vividsolutions.jts.io.WKTReader reader = new com.vividsolutions.jts.io.WKTReader();
    try {
        jtsGeometry = reader.read(wkt);
    } catch (com.vividsolutions.jts.io.ParseException ex) {
        throw new net.sharkfw.knowledgeBase.SharkKBException("WKT parsing problem");
    }
    com.vividsolutions.jts.operation.valid.IsValidOp validOp = new com.vividsolutions.jts.operation.valid.IsValidOp(jtsGeometry);
    return validOp.isValid();
}