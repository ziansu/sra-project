public java.lang.String extractInstanceFileRelativeFilename(java.lang.String header) {
    int firstIndex = (header.indexOf(org.opendatakit.services.sync.service.logic.HttpRestProtocolWrapper.multipartFileHeader)) + (org.opendatakit.services.sync.service.logic.HttpRestProtocolWrapper.multipartFileHeader.length());
    if (firstIndex == (-1)) {
        return null;
    }
    int lastIndex = header.lastIndexOf("\"");
    java.lang.String partialPath = header.substring(firstIndex, lastIndex);
    return partialPath;
}