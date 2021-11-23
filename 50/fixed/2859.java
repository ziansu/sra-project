public void writeEndpointDescription(java.io.Writer writer, org.eclipse.ecf.osgi.services.remoteserviceadmin.EndpointDescription endpointDescription) throws java.io.IOException {
    if (endpointDescription != null)
        writeEndpointDescriptions(writer, new org.eclipse.ecf.osgi.services.remoteserviceadmin.EndpointDescription[]{ endpointDescription });
    
}