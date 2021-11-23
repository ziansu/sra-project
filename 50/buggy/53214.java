protected boolean isBlockTag(javax.swing.text.AttributeSet attr) {
    java.lang.Object o = attr.getAttribute(javax.swing.text.StyleConstants.NameAttribute);
    if (o instanceof javax.swing.text.html.HTML.Tag) {
        javax.swing.text.html.HTML.Tag name = ((javax.swing.text.html.HTML.Tag) (o));
        return name.isBlock();
    }
    return false;
}