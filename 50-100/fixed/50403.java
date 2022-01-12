public java.util.ArrayList<org.apache.poi.openxml4j.opc.PackagePart> getPartsByContentType(java.lang.String contentType) {
    java.util.ArrayList<org.apache.poi.openxml4j.opc.PackagePart> retArr = new java.util.ArrayList<org.apache.poi.openxml4j.opc.PackagePart>();
    for (org.apache.poi.openxml4j.opc.PackagePart part : partList.values()) {
        if (part.getContentType().equals(contentType))
            retArr.add(part);
        
    }
    java.util.Collections.sort(retArr);
    return retArr;
}