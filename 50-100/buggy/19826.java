protected void encodeListInput(javax.faces.context.FacesContext context, java.lang.String clientId) throws java.io.IOException {
    javax.faces.context.ResponseWriter writer = context.getResponseWriter();
    writer.startElement("select", null);
    writer.writeAttribute("id", clientId, null);
    writer.writeAttribute("name", clientId, null);
    writer.writeAttribute("multiple", "true", null);
    writer.writeAttribute("class", "ui-helper-hidden", null);
    writer.endElement("select");
}