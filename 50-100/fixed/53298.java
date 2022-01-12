@java.lang.Override
public void headerFooter(java.lang.String text, boolean isHeader, java.lang.String tagName) {
    if (isHeader) {
        sb.append("<header tagName=\"").append(tagName).append("\">").append(text).append("</header>");
    }else {
        sb.append("<footer tagName=\"").append(tagName).append("\">").append(text).append("</footer>");
    }
}