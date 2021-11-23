private java.lang.String publishImg(java.lang.String imgType, java.lang.String imageId, int index) {
    java.lang.String mimeEncodedImage = (("data:image/" + imgType) + ";base64,") + (data);
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append(net.masterthought.cucumber.json.Embedded.getExpandAnchor(imageId, "Screenshot", index));
    sb.append(java.lang.String.format("<a href=\"%s\">", mimeEncodedImage));
    sb.append(net.masterthought.cucumber.json.Embedded.getImg(imageId, mimeEncodedImage));
    sb.append("</a></br>");
    return sb.toString();
}