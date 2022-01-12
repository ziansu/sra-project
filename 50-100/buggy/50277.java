private org.apache.jackrabbit.webdav.MultiStatusResponse[] getResponsesFromPropFindMethod(java.lang.String folderPath, org.apache.jackrabbit.webdav.client.methods.PropFindMethod method) throws nl.esciencecenter.xenon.XenonException {
    org.apache.jackrabbit.webdav.MultiStatus multiStatus = null;
    try {
        multiStatus = method.getResponseBodyAsMultiStatus();
    } catch (java.io.IOException | org.apache.jackrabbit.webdav.DavException e) {
        throwDirectoryListingException(folderPath, e);
    }
    org.apache.jackrabbit.webdav.MultiStatusResponse[] responses = multiStatus.getResponses();
    return responses;
}