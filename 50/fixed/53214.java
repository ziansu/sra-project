protected boolean isBlockTag(javax.swing.text.AttributeSet attr) {
    java.lang.Object obj = attr.getAttribute(javax.swing.text.StyleConstants.NameAttribute);
    if (obj instanceof javax.swing.text.html.HTML.Tag) {
        javax.swing.text.html.HTML.Tag name = ((javax.swing.text.html.HTML.Tag) (obj));
        return name.isBlock();
    }
    return false;
}