public java.util.ArrayList<org.apache.poi.openxml4j.opc.PackagePart> getPartsByRelationshipType(java.lang.String relationshipType) {
    if (relationshipType == null)
        throw new java.lang.IllegalArgumentException("relationshipType");
    
    java.util.ArrayList<org.apache.poi.openxml4j.opc.PackagePart> retArr = new java.util.ArrayList<org.apache.poi.openxml4j.opc.PackagePart>();
    for (org.apache.poi.openxml4j.opc.PackageRelationship rel : getRelationshipsByType(relationshipType)) {
        org.apache.poi.openxml4j.opc.PackagePart part = getPart(rel);
        if (part != null) {
            retArr.add(part);
        }
    }
    return retArr;
}