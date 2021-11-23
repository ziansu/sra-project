public java.lang.String getText() {
    if (!(isClosed()))
        doComplete.run();
    
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    for (aanchev.xmlstreamer.Element child : children) {
        sb.append(child.getText());
        sb.append(" ");
    }
    sb.deleteCharAt(((sb.length()) - 1));
    return sb.toString();
}