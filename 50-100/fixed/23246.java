private java.lang.String publishHTMLType(java.lang.String contentId, int index) {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append(net.masterthought.cucumber.json.Embedded.getExpandAnchor(contentId, "HTML text", index));
    sb.append(java.lang.String.format("<span id=\"%s\" style=\"max-width:250px; display:none;\">%s</span><br>", contentId, decodeDataFromBase()));
    return sb.toString();
}