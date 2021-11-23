private void AppendTableHeaders(org.w3c.dom.Element tableHeaderRow, org.w3c.dom.Document doc, scadinspect.data.scaddoc.ScadDocuFile file) {
    java.util.ArrayList<java.lang.String> keys = ((java.util.ArrayList<java.lang.String>) (file.getAllKeys()));
    for (int i = 0; i < (keys.size()); i++) {
        org.w3c.dom.Element header = doc.createElement("th");
        header.appendChild(doc.createTextNode(keys.get(i)));
        tableHeaderRow.appendChild(header);
    }
}