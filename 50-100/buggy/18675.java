private org.w3c.dom.Element createFirstLine(org.w3c.dom.Document doc, java.lang.String note) {
    org.w3c.dom.Element parent = doc.createElement("note");
    java.lang.StringBuilder builder = new java.lang.StringBuilder(note.substring(0, 1).toUpperCase());
    builder.append(note.substring(1));
    builder.append(" [First line of poetry.]");
    parent.setTextContent(builder.toString());
    return parent;
}