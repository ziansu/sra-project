protected void writeEndpointDescription(int indentLevel, java.io.Writer writer, org.eclipse.ecf.osgi.services.remoteserviceadmin.EndpointDescription endpointDescription) throws java.io.IOException {
    if (endpointDescription != null) {
        indent(indentLevel, writer);
        writer.append("<endpoint-description>");
        newLine(writer);
        writeProperties(indentLevel, writer, endpointDescription);
        indent(indentLevel, writer);
        writer.append("</endpoint-description>");
        newLine(writer);
    }
}