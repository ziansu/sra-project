protected boolean matchNameAttribute(javax.swing.text.AttributeSet attr, javax.swing.text.html.HTML.Tag tag) {
    java.lang.Object o = attr.getAttribute(javax.swing.text.StyleConstants.NameAttribute);
    if (o instanceof javax.swing.text.html.HTML.Tag) {
        javax.swing.text.html.HTML.Tag name = ((javax.swing.text.html.HTML.Tag) (o));
        if (name == tag) {
            return true;
        }
    }
    return false;
}